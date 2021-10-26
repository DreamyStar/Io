package com.zlq.lo.Thread;

public class Thread2 extends Thread {
    public Thread uuB;

    @Override
    public void run() {
        try {
            uuB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("线程B"+"\t"+Thread.currentThread().getName()+"\t"+i);

        }
    }
}
