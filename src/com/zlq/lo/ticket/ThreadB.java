package com.zlq.lo.ticket;

public class ThreadB extends Thread{
    Object a = new Object();
    Object b = new Object();
    public ThreadB(Object a,Object b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println("b锁");
        synchronized (b){
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("a锁");
            synchronized (a){
                a.notify();
            }
            System.out.println("sa锁");
        }
        System.out.println("sb锁");
    }
}
