package com.javacodes;

public class Pyramid {
    public static void rightTriangle(int n){
        int i, j;
        for(i = 0; i<n; i++){
            for(j = i; j < n; j++)
                System.out.print(" ");
            for(j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        rightTriangle(n);
    }
}
