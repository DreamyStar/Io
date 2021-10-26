package com.zlq.lo.ticket;

public class test {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        ThreadA d = new ThreadA(a,b);
        ThreadB dd = new ThreadB(a,b);
        d.start();
        dd.start();
    }
}
