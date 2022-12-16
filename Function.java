package com.javacodes;
import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            sum();
        }
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}
