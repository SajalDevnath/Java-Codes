package com.javacodes;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
