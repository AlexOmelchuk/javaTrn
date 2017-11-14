package com.alexomelchuk.logicalOperators;

import java.util.Scanner;
public class RangeFrom100To200 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = s.nextInt();
        s.close();

        if (n >=100 && n <=200){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
