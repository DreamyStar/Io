package com.zlq.lo.ticket;

public class ThreadA extends Thread{
    Object a = new Object();
    Object b = new Object();
    public ThreadA(Object a,Object b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println("A锁");
        synchronized (a){
            try {
                a.wait();
//                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B锁");
            synchronized (b){
            }
            System.out.println("sB锁");
        }
        System.out.println("sA锁");
    }
}
