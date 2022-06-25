package com.cvs.again;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacture", 0.10,"red");
        fan.switchOn();
        System.out.println(fan);
        fan.switchoff();
        System.out.println(fan);
    }
}
