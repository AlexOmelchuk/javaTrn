package com.alexomelchuk.lesson3;

import java.util.Scanner;
public class NameSubstitutor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enetr message: ");
        String message = s.nextLine();
        System.out.print("Enter name: ");
        String name = s.nextLine();
        String rename = message.replace("${name}", name);
        s.close();

        System.out.println(rename);

    }
}
