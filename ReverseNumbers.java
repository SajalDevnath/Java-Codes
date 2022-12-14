package com.javacodes;
import java.util.Scanner;
public class ReverseNumbers {
    public static void main(String[] args) {
        int n = 23789;

        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            ans = ans * 10 + rem;
        }

        System.out.println(ans);
    }
}
