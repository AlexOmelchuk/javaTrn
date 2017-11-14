package com.alexomelchuk.lesson2;

import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = s.nextInt();
        System.out.println("Enter number b");
        int b = s.nextInt();
        s.close();

        int avg = (a/2 + b/2) + (a%2 + b%2)/2;

        System.out.println(" avg = " + avg);
    }
}
