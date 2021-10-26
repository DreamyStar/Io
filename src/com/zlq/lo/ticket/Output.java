package com.zlq.lo.ticket;

public class Output implements Runnable {
    private Res r;

    public Output(Res r) {
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
                System.out.println(r.name + "......" + r.sex);
                r.flag = false;
                r.notify();
            }
        }
    }
}
