package com.zlq.lo.ThreadTest;

import com.zlq.lo.Thread.*;

public class ABCDTest {
    public static void main(String[] args) {
        ThreadMA a = new ThreadMA();
        ThreadMB b = new ThreadMB();
        ThreadMC c = new ThreadMC();
        ThreadMD d = new ThreadMD();
        a.start();
        c.start();
        b.start();
        d.start();
    }
}
