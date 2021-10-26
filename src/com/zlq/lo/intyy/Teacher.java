package com.zlq.lo.intyy;

public class Teacher {
    static int age;
    String name;
    public static void say(){
        System.out.println(age);
//        System.out.println(name);
    }
    public void eat(){
        System.out.println(age);
        System.out.println(name);
    }
    int num  = 10;
    static int num2 = 20;

    public static class Inner {
        public void show() {
            System.out.println("show");
//            System.out.println(num);
            System.out.println(num2);
        }

        public static void show2() {
            System.out.println("show2");
//            System.out.println(num);
            System.out.println(num2);
        }
    }
}
