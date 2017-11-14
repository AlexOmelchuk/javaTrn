package com.alexomelchuk.loops;

public class OddNumbersFrom100To70 {
    public static void main(String[] args) {

        for(int n = 100; n>= 70; n--){
            if(n%2==1) {
                System.out.print(n + " ");
            }
        }
    }
}
