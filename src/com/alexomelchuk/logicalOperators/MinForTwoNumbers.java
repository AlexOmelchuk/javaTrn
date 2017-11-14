package com.alexomelchuk.logicalOperators;

import java.util.Scanner;
public class MinForTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();
        s.close();

        if (a < b) {
            System.out.println("Min = " + a);
        } else {
            System.out.println("Min = " + b);
        }
    }
}