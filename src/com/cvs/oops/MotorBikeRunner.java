package com.cvs.oops;

public class MotorBikeRunner {
    public static void main(String[] args) {

        MotorBike ducati = new MotorBike(10);
        MotorBike benz = new MotorBike(5);

        ducati.setSpeed(100);

        int ducatiSpeed= ducati.getSpeed();
        ducatiSpeed= ducatiSpeed + 100;
        ducati.setSpeed(ducatiSpeed);

        System.out.println(ducati.getSpeed());
//        benz.setSpeed(20);



    }
}
