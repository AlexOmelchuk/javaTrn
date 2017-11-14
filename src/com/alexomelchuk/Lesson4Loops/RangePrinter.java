package com.alexomelchuk.Lesson4Loops;
import java.util.Scanner;
public class RangePrinter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First: ");
        int first = s.nextInt();
        System.out.print("Enter Last: ");
        int last = s.nextInt();
        s.close();

        if(first<last){
            for (int i = first; i <= last; i++) {
            System.out.print(i + " ");
            }
        }
        else if (first> last){
            for (int n = first; n >= last; n--){
                System.out.print(n+ " ");
            }
        }
        else {
            System.out.println(first);
        }


    }

}
