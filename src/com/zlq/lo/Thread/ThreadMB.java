//import com.zlq.lo.Thread.Inter;

package com.zlq.lo.Thread;
//
//public class ThreadMB extends Thread{
//    private Inter r;
//    public ThreadMB(Inter r){
//        this.r = r;
//    }
//    @Override
//    public void run() {
//        while (true){
//            synchronized (r){
//                if (r.flag){
//                    try {
//                        r.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                System.out.println(r.j+"\t"+"这是J1");
//                r.j++;
//                r.flag = true;
//                r.notify();
//            }
//        }
//    }
//}
public class ThreadMB extends Inter {
    @Override
    public void run() {
        while (true){
           synchronized (ThreadMA.class){
               if (j >0){
                   j--;
                   System.out.println("线程二减："+"\t"+Thread.currentThread().getName()+"\t"+j);
               }
           }
        }
    }
}
