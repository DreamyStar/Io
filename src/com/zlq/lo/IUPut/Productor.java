package com.zlq.lo.IUPut;

public class Productor implements Runnable{     //生产者
    Clerk clk;
    public Productor(Clerk clk){
        this.clk = clk;
    }
    @Override
    public void run() {
        System.out.println("开始生产产品");
        while (true){
            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clk.addProduct();
        }
    }
}
