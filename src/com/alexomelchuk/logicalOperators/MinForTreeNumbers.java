package com.alexomelchuk.logicalOperators;

import java.util.Scanner;
public class MinForTreeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();
        System.out.print("Enter c: ");
        int c = s.nextInt();
        s.close();

        if (a<b && a<c){
            System.out.println("Min a = " + a);
        }
        else if (b<a && b<c){
            System.out.println("Min b = "+ b);
        }
        else {
            System.out.println("Min c = "+c);
        }
    }
}
