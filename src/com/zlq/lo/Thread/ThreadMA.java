package com.zlq.lo.Thread;

/**
 * 设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。写出程序。
 */
public class ThreadMA extends Inter{
    static  int j = 0;
    @Override
    public void run() {
        while (true){
            synchronized (ThreadMA.class){
                j++;
                System.out.println("线程一加："+"\t"+Thread.currentThread().getName()+"\t"+j);
            }

        }
    }
}
