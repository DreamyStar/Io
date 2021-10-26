package com.zlq.lo.Thread;

public class PersonA extends Thread{
    private Account cc;
    public  PersonA(Account cc){
        this.cc = cc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            cc.cun(500);
        }
    }
}
