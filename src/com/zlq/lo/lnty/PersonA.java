package com.zlq.lo.lnty;

public class PersonA extends Thread{
    private Account a;
    public PersonA(Account a){
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            a.cun(500);

        }
    }
}
