package com.alexomelchuk.Lesson4Loops;
import java.util.Scanner;
public class EvensRangePrinter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First: ");
        int first = s.nextInt();
        System.out.print("Enter Last: ");
        int last = s.nextInt();
        s.close();

        if (first<last){
            for (int i=first; i<=last; i++){
                if(i%2==0){
                    System.out.print(i+ " ");
                }
            }
        }
        else if (first>last){
            System.out.print("");
        }
        else{
            System.out.print(first);
        }
    }
}
