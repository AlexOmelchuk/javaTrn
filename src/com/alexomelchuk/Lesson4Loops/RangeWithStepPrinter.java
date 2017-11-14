package com.alexomelchuk.Lesson4Loops;
import java.util.Scanner;
import java.lang.IllegalArgumentException;
public class RangeWithStepPrinter {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter First: ");
        int first = s.nextInt();
        System.out.print("Enter Last: ");
        int last = s.nextInt();
        System.out.print("Enter Step: ");
        int step = s.nextInt();
        s.close();

        if (first<last && step>0){
            for (int i = first; i <= last; i=i+step){
                System.out.print(i+ " ");
            }
        }
        else if (first>last && step<0){
            for (int n = first; n >= last; n=n+step){
                System.out.print(n +" ");
            }
        }
        else if (first==last && step==first){
            System.out.print(first);
        }
        else {
            throw new IllegalArgumentException("IllegalArgumentException");
        }

    }
}
