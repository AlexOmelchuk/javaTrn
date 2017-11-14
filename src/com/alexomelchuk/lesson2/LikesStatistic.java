package com.alexomelchuk.lesson2;

import java.util.Scanner;
public class LikesStatistic {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter likesCount");
        long likesCount = s.nextLong();
        System.out.println("Enter registrationYear");
        int registrationYear = s.nextInt();
        s.close();
        int currentYear = java.time.Year.now().getValue();

        double likesPerYear = (double)likesCount/ (currentYear - registrationYear+1);
        System.out.println(likesPerYear + " likes/ year");
    }
}
