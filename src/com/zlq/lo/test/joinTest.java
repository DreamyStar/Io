package com.zlq.lo.test;

import com.zlq.lo.entry.joinA;
import com.zlq.lo.entry.joinB;

public class joinTest {

    public static void main(String[] args) {
        joinB td = new joinB();
        joinA a = new joinA(td);
        a.start();
        td.start();

    }
}
