package com.cvs.oops;

public class BookRunner {
    public static void main(String[] args) {
         Books java = new Books();
         Books social = new Books();

         java.read();
         social.read();

         java.noOfCopies  = 10;
         social.noOfCopies=5;
    }
}
