package com.alexomelchuk.lesson4Conditions;
import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class ToyNameToldConverter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name of the toy: ");
        String name = s.nextLine();
        s.close();
        int id;



        switch (name){
            case "Car":  id = 0;
            break;
            case "Lego":  id = 1;
            break;
            case "Doll":  id = 2;
            break;
            case "Puzzle": id = 3;
            break;
            default: throw new IllegalArgumentException("IllegalArgumentException");
        }
        System.out.println(id);
    }
}
