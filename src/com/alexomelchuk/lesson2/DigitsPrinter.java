package com.alexomelchuk.lesson2;

import java.util.Scanner;
public class DigitsPrinter {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter number");
        int n = s.nextInt();
        int b = 100000;
        s.close();
        for (int i=0; i<5; i++) {
           b = b / 10;
           int a = (n/b)%10;
           System.out.println(a);
        }

//        int a = 24;
//
//        for (int i = 100000; i>1; i=i/10){
//            System.out.println((int)((a%i)/(i/10)));
//        }


    }
}

