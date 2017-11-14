package com.alexomelchuk.lesson1;

import com.sun.org.apache.xpath.internal.SourceTree;

public class PersonInfo {
    public static void main (String [] args){
       // int age = 25;
        //String name = "Taras";
       // System.out.println ("Hello, my name is "+ name);
        //System.out.println("I'm " + age + " years old" );
        Person ("Sasha", 25);
        Person ("Taras", 20);
       // AgePerson (age);
    }
    public static void Person (String name, int age){
        System.out.println ("Hello, my name is "+ name);
        System.out.println ("I'm " + age + " years old" );
    }
   // public static void AgePerson (int age){
     //   System.out.println ("I'm " + age + " years old" );
    //}
}
