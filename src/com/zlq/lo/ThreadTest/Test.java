package com.zlq.lo.ThreadTest;

import com.zlq.lo.Thread.Thread1;
import com.zlq.lo.Thread.Thread2;

public class Test {
    public static void main(String[] args) {
        Thread2 d = new Thread2();
        Thread1 t = new Thread1();
       t.uuA = d;
       d.uuB = t;

        t.start();
        d.start();

    }
}
