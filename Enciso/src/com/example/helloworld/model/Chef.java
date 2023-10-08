package com.example.helloworld.model;

public class Chef extends Employee{

    public Chef() {
        this.setName("Chef");
    }

    public Chef(float salary) {
        super(salary);
    }

    @Override
    public void theString() {
        System.out.println("Hello Chef");
    }
}
