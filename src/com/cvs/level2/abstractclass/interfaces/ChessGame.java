package com.cvs.level2.abstractclass.interfaces;

public class ChessGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("movie piece up");

    }

    @Override
    public void down() {
        System.out.println("move piece down ");
    }

    @Override
    public void left() {
        System.out.println("piece foward");

    }

    @Override
    public void right() {
        System.out.println("piece backward");

    }
}
