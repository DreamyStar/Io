package com.zlq.lo.ThreadTest;

import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args) {
        int[] aa = {4,23,23,2,7,8};
        int tem = 0;
        for (int i = 0; i < aa.length-1; i++) {
            for (int j = 0; j < aa.length-1-i; j++) {
                if (aa[j] > aa[j+1]){
                    tem = aa[j];
                    aa[j] = aa[j+1];
                    aa[j+1] = tem;
                }
            }

        }
//        for (int a: aa){
//            System.out.println(a);
//        }
        System.out.println(Arrays.toString(aa));
    }
}
