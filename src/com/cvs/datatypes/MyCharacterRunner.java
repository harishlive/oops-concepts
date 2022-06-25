package com.cvs.datatypes;

public class MyCharacterRunner {
    public static void main(String[] args) {
        Mychar myChar = new Mychar('1');

        System.out.println(myChar.isVowel());
       // myChar.isConsonant();

        System.out.println(myChar.isDigit());

        System.out.println(myChar.isAlphabet());
        System.out.println(myChar.isConsonant());

        Mychar.printLowerCase();
        Mychar.printUpperCase();



    }
}
