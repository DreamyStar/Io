package com.zlq.lo.test;

import com.zlq.lo.entry.Sleep;
import com.zlq.lo.entry.thread;

public class SleepTest {
    public static void main(String[] args) {
        Sleep s = new Sleep();
        Thread d = new Thread(s);
        d.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"\t"+i);

        }
    }

}
