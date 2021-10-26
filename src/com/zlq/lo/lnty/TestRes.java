package com.zlq.lo.lnty;


public class TestRes {
    public static void main(String[] args) {
        Res r =new Res();
        InPut p = new InPut(r);
        OuPut pp = new OuPut(r);
        Thread d = new Thread(p);
        Thread dd = new Thread(pp);
        d.start();
        dd.start();

    }
}
