package com.zlq.lo.Thread;

public class Thread1 extends Thread{
    public Thread uuA;

    @Override
    public void run() {
        try {
            uuA.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("线程A"+"\t"+Thread.currentThread().getName()+"\t"+i);

        }
    }
}
