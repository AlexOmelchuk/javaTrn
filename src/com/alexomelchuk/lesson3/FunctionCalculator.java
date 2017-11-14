package com.alexomelchuk.lesson3;

import java.util.Scanner;
public class FunctionCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = s.nextDouble();


        double f = Math.log(Math.sin(x) + (Math.pow(Math.E,x) * (Math.sqrt(x)/ Math.PI)));
        System.out.println("f(x) = "+ f);
    }
}
