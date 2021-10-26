package com.zlq.lo.ThreadTest;

public class Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        boolean c = (s1 == s2);
        System.out.println(c);
        String a1 = new String();
        String a2 = new String();
        boolean x = (a1 == a2);
        System.out.println(x);
    }
}
