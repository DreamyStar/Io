package com.zlq.lo.Thread;
//
//public class ThreadMD extends Thread{
//    private Inter r;
//    public ThreadMD(Inter r){
//        this.r = r;
//    }
//    public void run() {
//        while (true){
//            synchronized (r){
//                if (!r.flag){
//                    try {
//                        r.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                System.out.println(r.i+"\t"+"这是I1");
//                r.i--;
//                r.flag = false;
//                r.notify();
//            }
//        }
//    }
//}
public class ThreadMD extends Inter{
    @Override
    public void run() {
        while (true){
            if (j>0){
                j--;
                System.out.println("线程四减："+"\t"+Thread.currentThread().getName()+"\t"+j);
            }
        }
    }
}

