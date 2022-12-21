package com.javacodes;
import java.util.Scanner;
import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9

        Syntax: int[][] arr = new int[number of rows][number of columns]

        int[][] arr = {
            {1, 2, 3}, //0th index
            {4, 5, 6}, // 1st index
            {7, 8, 9} // 2nd index -> arr[2] = {7, 8, 9}
        };
        */

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows
        // input

        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        // output

//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
        // another way for the output

//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // enhanced way for the output

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
