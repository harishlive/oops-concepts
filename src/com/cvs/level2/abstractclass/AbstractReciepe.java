package com.cvs.level2.abstractclass;

public abstract class AbstractReciepe {

    //prepare
    //reciepe
    //cleanup
public void execute(){
    getReady();
    doThisDish();
    cleanUp();
}
abstract void getReady();
abstract void doThisDish();
abstract void cleanUp();


}
