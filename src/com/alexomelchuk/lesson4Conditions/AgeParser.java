package com.alexomelchuk.lesson4Conditions;

import java.util.Scanner;
import java.lang.IllegalArgumentException;
public class AgeParser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter age: ");
        String ageString = s.nextLine();
        s.close();

        int age = Integer.parseInt(ageString);

        if (age >= 1 && age <=120) {
            System.out.println(age);
        }
        else {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
    }

}
