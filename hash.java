package com.javacodes;
import java.util.Scanner;
public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k = 1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j = n-i+1;j>=1;j--){
                if(i%2==0){
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
