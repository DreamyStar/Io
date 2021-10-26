package com.zlq.lo.lnty;

public class PersonB extends Thread{
    private Account a;
    public PersonB(Account a){
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            a.qu(1000);

        }
    }
}
