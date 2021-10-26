package com.zlq.lo.test;

import com.zlq.lo.entry.ThreadA;
import com.zlq.lo.entry.ThreadB;

public class TestThread {
    public static void main(String[] args) {
        ThreadA t = new ThreadA();
        ThreadB t2 = new ThreadB();
        Thread a = new Thread (t);
        a.start();
        Thread a2 = new Thread(t2);
        a2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程"+"\t"+Thread.currentThread().getName()+"\t"+i);

        }
    }
}
