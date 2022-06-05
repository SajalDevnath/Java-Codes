package com.javacodes;

import java.util.Scanner;

public class leftshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[]{2, 4, 5, 6, 9};
        while(n!=0){  // left shift n times
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i >= 1 ; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            n--;
        }
        for (int i:
             arr) {
            System.out.print(i);
        }
    }
}
