package com.cvs.level2.abstractclass;

public class ReciepeWithMicrowave extends  AbstractReciepe{
    @Override
    void getReady() {

        System.out.println("get the raw materials");
        System.out.println("switch on microwave");

    }

    @Override
    void doThisDish() {
        System.out.println("do the dish");
        System.out.println("put on microwave");

    }

    @Override
    void cleanUp() {

        System.out.println("clean up the utensils");
        System.out.println(" of microwave");


    }
}
