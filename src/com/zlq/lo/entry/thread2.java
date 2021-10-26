package com.zlq.lo.entry;

public class thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程B"+Thread.currentThread().getName()+i);

        }
    }
}
