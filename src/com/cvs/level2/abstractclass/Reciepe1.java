package com.cvs.level2.abstractclass;

public class Reciepe1 extends  AbstractReciepe{
    @Override
    void getReady() {

        System.out.println("get the raw materials");

    }

    @Override
    void doThisDish() {
        System.out.println("do the dish");

    }

    @Override
    void cleanUp() {

        System.out.println("clean up the utensils");

    }
}
