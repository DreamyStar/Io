package com.zlq.lo.entry;

import com.zlq.lo.ticket.Ticket;

public class TicketTest {
    public static void main(String[] args) {
        Ticket t = new Ticket();

        Thread d1 = new Thread(t);
        Thread d2 = new Thread(t);
        Thread d3 = new Thread(t);

        d1.setName("d1窗口");
        d2.setName("d2窗口");
        d3.setName("d3窗口");

        d1.start();
        d2.start();
        d3.start();
//        for (int i = 0; i < 100; i++) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+i);

//        }


    }
}
