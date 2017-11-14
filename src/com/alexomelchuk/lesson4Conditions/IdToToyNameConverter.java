package com.alexomelchuk.lesson4Conditions;
import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class IdToToyNameConverter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the toy id: ");
        int id = s.nextInt();

        if (id ==0){
            System.out.println("Car");
        }
        else if (id ==1){
            System.out.println("Lego");
        }
        else if (id ==2){
            System.out.println("Doll");
        }
        else if (id ==3){
            System.out.println("Puzzle");
        }
        else {
            throw new IllegalArgumentException("IllegalArgumentException");
        }

    }
}

