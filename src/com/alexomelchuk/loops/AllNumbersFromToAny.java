package com.alexomelchuk.loops;

import java.util.Scanner;
public class AllNumbersFromToAny {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter From: ");
        int from = s.nextInt();
        System.out.print("Enter To: ");
        int to = s.nextInt();
        s.close();


        if( from <=to){
            for (int i = from; i <= to; i++) {
                System.out.print(i + " ");
            }
        }
        else{
            for (int n = from; n >= to; n--) {
                System.out.print(n + " ");
            }
        }

    }
}
