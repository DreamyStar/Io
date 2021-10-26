package com.zlq.lo.IUPut;

import javax.jws.soap.SOAPBinding;

public class ThreadM extends Thread{
    Object a = new Object();
    Object b = new Object();
    public ThreadM(Object a,Object b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println("获取A锁");
        synchronized (a){
            try {
                a.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("获取B锁");
            synchronized (b){

            }
            System.out.println("释放A锁");
        }
        System.out.println("释放B锁");
    }
}
