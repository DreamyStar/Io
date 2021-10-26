package com.zlq.lo.IUPut;

public class ThreadN extends Thread{
    Object a = new Object();
    Object b = new Object();
    public ThreadN(Object a,Object b){
        this.a =  a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println("获取b锁");
        synchronized (b){
            System.out.println("获取a锁");
            synchronized (a){
                a.notify();

            }
            System.out.println("释放b锁");

        }
        System.out.println("释放a锁");
    }
}
