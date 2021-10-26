package com.zlq.lo.ticket;

public class IuPut implements Runnable {
    private Res r;

    public IuPut(Res r) {
        this.r = r;
    }

    @Override
    public void run() {
        int x = 0;
        while (true) {
            synchronized (r) {
                if (r.flag) {
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (x == 0) {
                    r.name = "杰克";
                    r.sex = "男";
                } else {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    r.name = "肉死";
                    r.sex = "女";
                }
                x = (x + 1) % 2;
                r.flag = true;
                r.notify();
            }
        }
    }
}
