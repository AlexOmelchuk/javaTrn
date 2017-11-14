package com.alexomelchuk.lesson4Conditions;

import java.util.Scanner;
public class MinMaxCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();
        s.close();

        if ( a>b){
            System.out.println("Min = " + b + ", Max = " + a);
        }
        else {
            System.out.println("Min = " + a + ", Max = " + b);
        }

        //System.out.println("The max number of 2 numbers: " + Math.max(a,b));
       // System.out.println("The min number of 2 numbers: " + Math.min(a,b));

    }
}
