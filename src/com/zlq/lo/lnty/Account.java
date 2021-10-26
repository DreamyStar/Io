package com.zlq.lo.lnty;

public class Account {
    private double balance;
    public Account(double balance){
        this.balance = balance;
    }
    public synchronized void cun(double balance){
        System.out.println("存款前的余额"+this.balance);
        this.balance += balance;
        System.out.println("存款后的余额"+this.balance);
    }
    public synchronized void qu(double balance){
        System.out.println("取款前余额"+this.balance);
        if (this.balance >= balance){
         this.balance -= balance;
        }else
            System.out.println("余额不足！！！！");
    }
}
