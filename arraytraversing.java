package com.javacodes;

import java.util.Scanner;

public class arraytraversing {
    public static void main(String[] args) {

        // traversing
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        // forward traversing
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        // backward traversing
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }

        // number swap

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = 0;

        d = a;
        a = c;
        c = d;
        System.out.print(a + " " + b + " " + c);
    }
}
