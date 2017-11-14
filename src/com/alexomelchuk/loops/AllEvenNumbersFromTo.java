package com.alexomelchuk.loops;

import java.util.Scanner;
public class AllEvenNumbersFromTo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter From: ");
        int from = s.nextInt();
        System.out.print("Enter To: ");
        int to = s.nextInt();
        s.close();

        for (int i = from; i <= to; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
