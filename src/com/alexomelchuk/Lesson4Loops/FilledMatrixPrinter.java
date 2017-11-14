package com.alexomelchuk.Lesson4Loops;
import java.util.Scanner;
import java.lang.IllegalArgumentException;
public class FilledMatrixPrinter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = s.nextInt();
        System.out.print("Enter Cols: ");
        int cols = s.nextInt();
        System.out.print("Enter Filler");
        int filler = s.nextInt();
        s.close();

        int matrix [][] = new int [rows][cols];


        if (rows > 0 && cols >0){
            for(int i = 0; i<rows; i++){
                for (int k = 0; k< cols; k++){
                    matrix[i][k] = filler;
                System.out.print(matrix[i][k]+ "\t");
                }
                System.out.println();
            }
        }
        else if (rows<0 || cols<0){
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        else{
            System.out.println();
        }
    }
}
