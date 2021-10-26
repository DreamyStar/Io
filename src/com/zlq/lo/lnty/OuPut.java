package com.zlq.lo.lnty;

public class OuPut implements Runnable {
    private Res r;

    public OuPut(Res r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (r) {
                if (!r.flag) {
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(r.name + "------" + r.sex);
                r.flag = false;
                r.notify();
            }
        }
    }
}
