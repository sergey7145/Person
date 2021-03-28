package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("введите имя человека ");
        Person person1=new Person("Sergey",13);
        Person person2=new Person();
person1.move();
person1.talk();
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите имя человека");
person2.fullname=scanner.nextLine();
        System.out.println("введите возрост человека");
person2.age=scanner.nextInt();
person2.move();
person2.talk();
    }
}
