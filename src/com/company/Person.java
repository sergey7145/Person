package com.company;

public class Person {
    private final String fullName;
    private final int age;


    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        fullName = "Bob";
        age = 8;
    }


    void move() {
        System.out.println(fullName + " is moving");
    }

    void talk() {
        System.out.println(fullName + " is talking");
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}
