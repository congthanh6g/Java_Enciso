package com.example.helloworld.model;

public abstract class Animal {
    public Animal() {
    }

    public void theString() {
        System.out.println("Hello"); // phuong thuc binh thuong co than ham
    }

    public abstract void sua();// phuong thuc abstract : khong co than ham
}
