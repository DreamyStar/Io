package com.zlq.lo.ThreadTest;

import com.zlq.lo.Thread.Account;
import com.zlq.lo.Thread.PersonA;
import com.zlq.lo.Thread.PersonB;

public class monTest {
    public static void main(String[] args) {
        Account cc =new  Account(3000);
        PersonA pa = new PersonA(cc);
        PersonB pp = new PersonB(cc);

        pa.start();
        pp.start();
    }
}
