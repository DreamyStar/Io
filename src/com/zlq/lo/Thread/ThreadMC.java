//import com.zlq.lo.Thread.Inter;

package com.zlq.lo.Thread;
//
//import javax.jws.soap.SOAPBinding;
//
//public class ThreadMC extends Thread{
//    private Inter r;
//    public ThreadMC(Inter r){
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
//                System.out.println(r.i+"\t"+"这是I");
//                r.i--;
//                r.flag = true;
//                r.notify();
//            }
//        }
//    }
//}
public class ThreadMC extends Inter {
    @Override
    public void run() {
        while (true){
            j++;
            System.out.println("线程三加："+"\t"+Thread.currentThread().getName()+"\t"+j);
        }
    }
}

