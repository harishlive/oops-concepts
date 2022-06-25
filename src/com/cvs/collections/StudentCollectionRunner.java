package com.cvs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {
    public static void main(String[] args) {

        List<Student> students = List.of(new Student(1,"Harish"),
        new Student(100, "Peravali"),
                new Student(2, "Sachin"));

        List<Student> studentsA1 = new ArrayList<>(students);

        System.out.println(studentsA1);

        Collections.sort(studentsA1);
        System.out.println(studentsA1);
    }
}
