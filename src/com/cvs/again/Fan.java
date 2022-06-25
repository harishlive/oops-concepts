package com.cvs.again;

public class Fan {
    //state
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;

    public Fan(String make, double radius, String color) {
        this.make = make;
        this.color = color;
        this.radius = radius;
    }

    public void switchOn(){
        isOn= true;

    }

    public void switchoff(){
        isOn= false;

    }

  

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    //prrint the state
    public  String toString() {
        return    String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make,radius,color, isOn,speed);

    }



}
