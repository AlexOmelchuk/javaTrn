package com.alexomelchuk.logicalOperators;

import java.util.Scanner;
public class MinusOneZeroPlusOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();
        s.close();

        if (a<b){
            System.out.println("-1");
        }
        else if (a==b){
            System.out.println("0");
        }
        else {
            System.out.println("+1");
        }
    }
}
