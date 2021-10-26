package com.zlq.lo.lnty;


public class InPut implements Runnable {
    private Res r;

    public InPut(Res r) {
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
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    r.name = "李白";
                    r.sex = "男";
                } else {
                    r.name = "貂蝉";
                    r.sex = "女";
                }
                x = (x + 1) % 2;
                r.flag = true;
                r.notify();
            }
        }

    }
}
