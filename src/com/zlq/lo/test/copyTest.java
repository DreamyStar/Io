package com.zlq.lo.test;

import com.zlq.lo.entry.copy;

import java.util.Scanner;

public class copyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要复制的文件");
        String oldPath2 = sc.next();
        System.out.println("请输入目标路径：");
        String newPath2 =  sc.next();

//        copy op = new copy() ;
        copy.copyFile(oldPath2,newPath2);
    }
}
