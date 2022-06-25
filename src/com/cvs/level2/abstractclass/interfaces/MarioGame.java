package com.cvs.level2.abstractclass.interfaces;

public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Jump");

    }

    @Override
    public void down() {
        System.out.println("go to hole");
    }

    @Override
    public void left() {
        System.out.println("go foward");

    }

    @Override
    public void right() {
        System.out.println("go backward");

    }
}
