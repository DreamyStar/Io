package com.zlq.lo.test;

import com.zlq.lo.entry.thread;
import com.zlq.lo.entry.thread2;

public class threadTest {
    public static void main(String[] args) {
        Thread t = new thread();
        t.start();      //开启线程
        Thread t2 = new thread2();
        t2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程"+Thread.currentThread().getName()+"\t"+i);

        }
    }
}
