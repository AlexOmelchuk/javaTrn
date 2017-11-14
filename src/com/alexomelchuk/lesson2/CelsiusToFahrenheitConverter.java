package com.alexomelchuk.lesson2;

import java.util.Scanner;
public class CelsiusToFahrenheitConverter {
   public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
       System.out.println("Type celsius");
        double celsius = s.nextDouble();
        s.close();
        double fahrenheit = (celsius * 1.8) + 32;
       System.out.println(celsius + " oC -> " + fahrenheit + " oF");
   }




}
