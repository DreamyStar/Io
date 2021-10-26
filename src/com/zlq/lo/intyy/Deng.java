package com.zlq.lo.intyy;

public class Deng {
    final static int Slow = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed = Slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Deng(){

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Deng{" +
                "风扇速度=" + speed +
                ", 是否打开=" + on +
                ", 风扇半径=" + radius +
                ", 颜色='" + color + '\'' +
                '}';
    }
}
