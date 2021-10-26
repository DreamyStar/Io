package com.zlq.lo.IUPut;

public class Consumer implements Runnable{          //消费者
    Clerk clk;
    public Consumer(Clerk clk){
        this.clk = clk;
    }
    @Override
    public void run() {
        System.out.println("消费者取走产品");
        while (true){
            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clk.getProduct();
        }


    }
}
