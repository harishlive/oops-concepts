package com.cvs.level2;

public class StudentRunner {

    public static void main(String[] args) {

//        Student student = new Student();
//        student.setName("Harish");
//        student.setEmail("Harish.peravali@gmail.com");
/*
        Person person = new Person();

        person.setName("ranga");

        String value =person.toString();
        System.out.println(value);
        System.out.println(person);

    }
}

 */
        Employee employee = new Employee("ranga","programmer analyst");
//        employee.setName("Harish");
        employee.setEmail("Harish.peravali@gmail.com");
        employee.setPhoneNumber("123-456-7890");
        employee.setEmployereGrade("A");
        employee.setTitle("Programmer");
//        System.out.println(employee);
    }

}