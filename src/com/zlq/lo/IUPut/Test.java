package com.zlq.lo.IUPut;

public class Test {
    public static void main(String[] args){
        Object a = new Object();
        Object b = new Object();
        ThreadM m = new ThreadM(a,b);
        ThreadN n = new ThreadN(a,b);
        m.start();
        n.start();
    }
}
