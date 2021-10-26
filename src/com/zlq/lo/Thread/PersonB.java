package com.zlq.lo.Thread;

public class PersonB extends Thread{
    private Account cc;
    public PersonB( Account cc){
        this.cc = cc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            cc.qu(1000);

        }
    }
}
