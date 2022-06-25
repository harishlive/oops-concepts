package com.cvs.collections;

import javax.xml.stream.events.Characters;
import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters = List.of('A','Z', 'A', 'B', 'Z','F');

        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println("treetSet" +treeSet);

        Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
        System.out.println("LinkedHashSet" + linkedHashSet);

        Set<Character> hashSet = new HashSet<>(characters);
        System.out.println("hashSet" + hashSet);

    }
}
