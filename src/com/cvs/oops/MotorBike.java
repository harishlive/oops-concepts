package com.cvs.oops;

public class MotorBike {

   private int speed;
    MotorBike(int speed){
        this.speed = speed;

    }

 void start(){

     System.out.println("Bike Start");

    }

    public int getSpeed() {
        return speed;
    }

     void setSpeed(int speed) {
     if (speed > 0)
         this.speed = speed;
         System.out.println(speed);
         System.out.println(this.speed);

    }
}

