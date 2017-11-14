package com.alexomelchuk.lesson2;

import java.util.Scanner;
public class BytesConverter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total bytes");
        long totalBytes =  s.nextLong();
        s.close();

        long gigaBytes = totalBytes / (1024*1024*1024);
        long left = totalBytes -(gigaBytes * 1024 * 1024 * 1024);
        long megaBytes = left /(1024*1024) ;
        left = left - (megaBytes * 1024 * 1024);
        long kiloBytes = left/1024;
        left = left - (kiloBytes * 1024);
        long bytes = left;

        System.out.println( gigaBytes + " GB, " + megaBytes + " MB, " + kiloBytes + " KB, " + bytes + " B ");

    }
}
