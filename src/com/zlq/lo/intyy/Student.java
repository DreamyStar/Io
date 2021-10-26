package com.zlq.lo.intyy;

public class Student extends Person{
    private int stuid;

    public Student(int t,int stuid) {
        super(t);
        this.stuid = stuid;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }
}
