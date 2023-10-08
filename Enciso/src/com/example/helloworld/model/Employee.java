package com.example.helloworld.model;

public class Employee {
    // Attribute chung

    private String name;
    private float salary;

    public Employee(){}

    public Employee(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void theString() {
        System.out.println("Hello");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
