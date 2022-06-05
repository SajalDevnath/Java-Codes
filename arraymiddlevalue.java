package com.javacodes;

import java.util.Scanner;

public class arraymiddlevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.print(arr[(arr.length/2) - 1]); // for even length
          System.out.print(arr[arr.length/2]);       // for odd length
    }
}
