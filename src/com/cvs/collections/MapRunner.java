package com.cvs.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {

        String str = "Tjis is an awesome ocasion." + "This has never happen before.";

        Map<Character, Integer> occarances = new HashMap<>();

     char[] characters = str.toCharArray();
     for(char character:characters){
         Integer integer = occarances.get(character);
         if(integer==null) {
             occarances.put(character, 1);
         } else {
             occarances.put(character,integer +1);

         }
     }
        System.out.println(occarances);



    }
}
