package com.zlq.lo.entry;

public class joinA extends Thread{
    private  Thread td;
    public joinA(Thread td){
        super();
        this.td = td;
    }

    @Override
    public void run() {
        try {
            td.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("线程A"+"\t"+Thread.currentThread().getName()+"\t"+i);

        }
    }
}
