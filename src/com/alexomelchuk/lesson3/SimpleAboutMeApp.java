package com.alexomelchuk.lesson3;

import java.util.Scanner;
public class SimpleAboutMeApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.print("Enter your lastname: ");
        String lastname = s.nextLine();
        System.out.print("Enter your age: ");
        int age = s.nextInt();

        System.out.println("I'm " + name + " " + lastname + ", " + age + " years old");


    }
}
