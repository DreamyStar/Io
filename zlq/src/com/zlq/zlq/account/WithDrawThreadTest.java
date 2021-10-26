package com.zlq.zlq.account;

public class WithDrawThreadTest {
    public static void main(String[] args) {
        Account a = new Account("1e833", 10000);
        Thread t1 = new WithDrawThread("小明", a, 8000);
        Thread t2 = new WithDrawThread("小白", a, 2800);
        t1.start();
        t2.start();
    }
}
