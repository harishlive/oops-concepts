package com.cvs.level2;

import java.math.BigDecimal;

public class Employee extends Person {

    private String title;
    private String employereGrade;
    private BigDecimal salary;

    public Employee(String name,String title ) {
        super(name);
this.title= title;
        System.out.println("Employee Constructor");
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployereGrade() {
        return employereGrade;
    }

    public void setEmployereGrade(String employereGrade) {
        this.employereGrade = employereGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String toString() {
        return title + "#" + employereGrade+ "#" + super.getName()  ;
    }
}
