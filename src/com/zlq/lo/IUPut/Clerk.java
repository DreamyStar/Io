package com.zlq.lo.IUPut;

/**
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处
 * 取走产品，店员一次只能持有固定数量的产品(比如:20），如果生产者试图
 * 生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了再通
 * 知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如
 * 果店中有产品了再通知消费者来取走产品。
 */

public class Clerk {                            //售货员
    private int product = 0;                    //产品
    public synchronized void addProduct(){      //增加的产品
        if (product >= 20){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("生产前还有"+"\t"+this.product+"\t"+"个");
            product++;
            System.out.println("生产的第"+"\t"+product+"\t"+"个产品");
            notifyAll();
        }
    }
    public synchronized void getProduct(){      //取走产品
        if (this.product <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("取走了第"+"\t"+product+"\t"+"个产品");
            product--;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("取走后还有"+"\t"+this.product+"\t"+"个");
            notifyAll();
        }
    }
}
