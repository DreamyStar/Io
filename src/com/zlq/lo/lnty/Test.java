package com.zlq.lo.lnty;

public class Test {
    public static void main(String[] args) {
        Account a = new Account(1000);
        PersonA pa = new PersonA(a);
        PersonB pp = new PersonB(a);
        pa.start();
        pp.start();

    }
}
