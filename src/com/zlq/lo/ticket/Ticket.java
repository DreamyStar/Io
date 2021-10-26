package com.zlq.lo.ticket;

/**
 * 取票
 */
public class Ticket implements Runnable {
    private int tick = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (Ticket.class) {
                if (tick > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "\t" + "售出车票，票号为：" + "\t" + tick);
                    tick--;
                } else{
                    break;

                }
            }
        }
    }
}
