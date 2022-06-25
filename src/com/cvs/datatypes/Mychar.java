package com.cvs.datatypes;

public class Mychar {
    private char ch;
    public Mychar(char ch) {
        this.ch = ch;
        
    }

    public static void printLowerCase() {
        for(char ch = 'a'; ch<='z'; ch ++){
            System.out.println(ch);
        }
    }

    public static void printUpperCase() {
        for(char ch = 'A'; ch<='Z'; ch ++) {
            System.out.println(ch);
        }
    }

    public boolean isVowel() {
         if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == '0' ||ch == 'u'  )
        return true;
         return false;

    }

    public boolean isDigit() {
        if(ch >=48 && ch <=57)
            return true;
        return false;
    }

    public boolean isAlphabet() {

        if(ch >=97 && ch <=122)
            return true;

        if(ch >=65 && ch <=90)
            return true;
        return false;

    }

    public boolean isConsonant() {
        if(isAlphabet() && !isVowel())
            return true;
        return false;
    }
}
