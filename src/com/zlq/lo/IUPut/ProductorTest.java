package com.zlq.lo.IUPut;

public class ProductorTest {
    public static void main(String[] args) {
        Clerk clk = new Clerk();
        Productor r = new Productor(clk);
        Consumer rr = new Consumer(clk);
        Thread d1 = new Thread(r);
        Thread d2 = new Thread(rr);
        d1.start();
        d2.start();

    }
}
