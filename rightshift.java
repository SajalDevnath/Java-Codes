package com.javacodes;

import java.util.Scanner;

public class rightshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[]{2, 3, 4, 5, 6};
        while(n!=0){    // right shift n times
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            n--;
        }
        for (int i :
                arr) {
            System.out.print(i);
        }
    }
}
