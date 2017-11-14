package com.alexomelchuk.lesson3;

import java.util.Scanner;

public class DifferentRadixSummator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Enetr X in Bin: ");
        int x = s.nextInt(2);
        System.out.print("Enter Y in Oct: ");
        int y = s.nextInt(8);
        System.out.print("Enter Z in Hex: ");
        int z = s.nextInt(16);
        s.close();
        int sum = x + y + z;
        System.out.println("X + Y + Z = " + sum);
    }
}
