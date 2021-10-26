package com.zlq.lo.ThreadTest;

import com.zlq.lo.ticket.IuPut;
import com.zlq.lo.ticket.Output;
import com.zlq.lo.ticket.Res;

public class OPTest {
    public static void main(String[] args) {
        Res r = new Res();
        Output o = new Output(r);
        IuPut u = new IuPut(r);
        Thread d = new Thread(o);
        Thread dd = new Thread(u);
        d.start();
        dd.start();
    }
}
