package com.company;

import java.util.Scanner;

public class Person {
    Scanner scanner=new Scanner(System.in);
    String fullname=scanner.nextLine();
    int age;
    public Person(String fullname,int age){
        this.fullname=fullname;
        this.age=age;
    }
    public Person(){
    }
    void move(){
        System.out.println(fullname+" is moving");
    }
    void talk(){
        System.out.println(fullname+" is talking");
    }

}
