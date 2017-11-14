package com.alexomelchuk.Lesson4Loops;
import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        s.close();
        long y=1;

        if(n>=1 && n<=20){
            for (int i = 1; i<=n; i++){
                y=y*i;
            }
            System.out.print(y);
        }
        else {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
    }
}
