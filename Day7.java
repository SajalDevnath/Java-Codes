package com.javacodes;
import java.util.Scanner;
public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            //space
            int space = n - i;
            for(int j = 1; j <= space; j++){
                System.out.print("  ");
            }
            //number;
            for(int j = i; j>= 1; j--){
                System.out.print(j+" ");
            }
            for(int j = 2; j<= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = n-1; i >=1 ; i--){
            //space
            int space = Math.abs(n - i);
            for(int j = 1; j <= space; j++){
                System.out.print("  ");
            }
            //number
            for(int j = i; j >= 1; j--){
                System.out.print(j+" ");
            }
            for(int j = 2; j <= i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
