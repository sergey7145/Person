package com.company;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Sergey", 13);
        Person person2 = new Person();
        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}
