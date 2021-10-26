package com.zlq.zlq.account;


/**
 * 1.定义一个Account类
 * 1）该Account类封装了账户编号（String）和余额（double）两个属性
 * 2）设置相应属性的getter和setter方法
 * 3）提供无参和有两个参数的构造器
 * 4）系统根据账号判断与用户是否匹配，需提供hashCode()和equals()方法的重写
 * 2.提供两个取钱的线程类：小明、小明’s wife
 * 1）提供了Account类的account属性和double类的取款额的属性
 * 2）提供带线程名的构造器
 * 3）run()方法中提供取钱的操作
 * 3.在主类中创建线程进行测试。考虑线程安全问题。
 */

public class Account {          //账户
    private String accountTd;   //账户ID
    private double balance;     //余额

    public Account() {
    }

    public Account(String accountTd, double balance) {
        this.accountTd = accountTd;
        this.balance = balance;
    }

    public String getAccountTd() {
        return accountTd;
    }

    public void setAccountTd(String accountTd) {
        this.accountTd = accountTd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "账户{" +
                "账户id='" + accountTd + '\'' +
                ", 余额=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Account account = (Account) o;
        if (accountTd == null) {
            if (account.accountTd != null)
                return false;
        } else if (!accountTd.equals(account.accountTd))
            return false;
        if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(account.balance))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accountTd == null) ? 0 : accountTd.hashCode());
        long temp;
        temp = Double.doubleToLongBits(balance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
