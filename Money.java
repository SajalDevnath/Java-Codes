package com.javacodes;
import java.util.*;
public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[]{100, 50, 10, 5, 2, 1};
        int store[] = new int[6];
        int sum = 0;
        for(int i = 0; i < 6; i++){
            store[i] = n/arr[i];
            n = n%arr[i];
        }
        for(int i = 0; i < 6; i++){
            sum = store[i] + sum;
        }
        System.out.println(sum);
    }
}
