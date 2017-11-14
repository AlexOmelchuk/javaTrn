package com.alexomelchuk.lesson4Conditions;

import java.util.Scanner;
public class IsAgeChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = s.nextInt();
        s.close();

        if (age <=120 && age >= 1){
            System.out.println("Your result: "+true);
        }
        else {
            System.out.println("Your result: "+false);
        }
    }
}
