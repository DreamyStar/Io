package com.zlq.lo.entry;

public class ThreadB implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程B"+"\t"+Thread.currentThread().getName()+"\t"+i);
        }
    }
}
