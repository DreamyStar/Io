package com.zlq.lo.intyy;

public class Test {
    public static void main(String[] args) {
        Smoke s =new Smoke() {
            public void say(){
                System.out.println("说");
            }
        };
        Teacher r = new Teacher();
        Teacher.Inner a = new Teacher.Inner();
        a.show();
        a.show2();

    }
}
