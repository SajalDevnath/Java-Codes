package com.javacodes;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String wd = sc.next();
        int n = wd.length();
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++)
                System.out.print(wd.charAt(j)+ "");
            for(int j = 0; j < i; j++)
                System.out.print(wd.charAt(j)+ "");
            System.out.println();
        }
    }
}
