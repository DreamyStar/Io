package com.zlq.zlq.account;

public class WithDrawThread extends Thread {
    Account account;
    double withDraw;

    public WithDrawThread(String name, Account account, double amt) {
        super(name);
        this.account = account;
        this.withDraw = amt;
    }

    @Override
    public void run() {
        synchronized (account) {
            if (account.getBalance() > withDraw) {
                System.out.println(Thread.currentThread().getName() + ":取款成功，取现金额：" + withDraw);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.setBalance(account.getBalance() - withDraw);
            } else {
                System.out.println("取现额度超过余额，取现失败");
            }
            System.out.println("现在账号余额为：" + account.getBalance());
        }
    }
}
