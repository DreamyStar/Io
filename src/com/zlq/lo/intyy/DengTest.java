package com.zlq.lo.intyy;

import java.util.Scanner;

public class DengTest {
    public static void main(String[] args) {
        Deng g = new Deng();
        Scanner sc = new Scanner(System.in);
        while (true){
            int i ;
            boolean flag = false;
            System.out.println("请输入0（关）或输入1（开）：");
            i = sc.nextInt();
            if (i == 1){
                System.out.println(g.toString());
                break;
            }else if (i == 0){
                g.setOn(flag);
                System.out.println(g.toString());
            }else {
                System.out.println("请重新输入：");
            }
        }
    }
}
