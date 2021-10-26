package com.zlq.lo.ThreadTest;
import java.util.Arrays;
public class Ze {
    public static void main(String[] args) {
        int[] aa = {4,8,9,3,0,2,1};
        int temp = 0;
        for (int i = 0; i < aa.length-1; i++) {
            int min = aa[i];
            int minIndex = i;
            for (int j = i+1; j < aa.length; j++) {
                if (min > aa[j]){
                    min = aa[j];
                    minIndex = j;
                }
            }
            temp = aa[i];
            aa[i] = aa[minIndex];
            aa[minIndex] = temp;
        }
        System.out.println(Arrays.toString(aa));
    }
}
