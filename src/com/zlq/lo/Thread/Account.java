package com.zlq.lo.Thread;


public class Account {
    Object o = new Object();
    private double balance;
    public Account(double b){
        this.balance = b;
    }
    public  void cun(double e){
        synchronized (o){
            System.out.println("存款前的余额"+"\t"+this.balance);
            this.balance += e;
            System.out.println("存款后的余额"+"\t"+this.balance);
        }
    }
    public  void qu(double a){
       synchronized (o){
           System.out.println("取款前的余额"+"\t"+this.balance);
           if (this.balance >= a){
               this.balance -= a;
               System.out.println("取款后的余额"+"\t"+this.balance);
           }else {
               System.out.println("余额不足");
           }
       }
    }

}
