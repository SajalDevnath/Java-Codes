package com.javacodes;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        /*
        for loop: You need to run for loop when you know how many times the loop is going to run! ex - print the first 10 numbers?
        Syntax:
        for(initialization, condition, increment/decrement){
            body
        }
        Q. Print numbers from 1 to 5
        for (int num = 1; num <= 5; num++){
            System.out.println(num);
        }
        Q. Print numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.print(num + " ");
        }
        While loop: You need to run while loop when you don't know how many times the loop is going to run! ex - keep taking input from user
        till the user does not presses X?
            Syntax:
            While(condition){
                body
            }
        int num = 1;
        while( num <= 10){
            System.out.print("Hi Sajal," + " ");
            num++;
        }
        Do while loop: The loop is going to be execute at least once!
            Syntax:
            do{
                body
            }while(condition);
        int num = 1;
        do{
            System.out.print("Hi Sajal");
        }while(num != 1);
        */
        // Q. find the largest of 3 numbers
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//      int d = sc.nextInt();
//        For 3 digits:
//        if(a > b){
//            if(a > c){
//                System.out.println(a);
//            }else
//                System.out.println(c);
//        }else{
//            if(b > c){
//                System.out.println(b);
//            }else
//                System.out.println(c);
//        }
//        For 4 digits:
//        if(a > b){
//            if(a > c){
//                if(a > d){
//                    System.out.println(a);
//                }else{
//                    System.out.println(d);
//                }
//            }else{
//                if(b > c){
//                    if(b > d){
//                        System.out.println(b);
//                    }else{
//                        System.out.println(d);
//                    }
//                }
//            }
//        }else{
//            if(c > d){
//                System.out.println(c);
//            }else{
//                System.out.println(d);
//            }
//        }
        // Another approach:
//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//        if(d > max){
//            max = d;
//        }
//        System.out.println(max);
//      Another Approach:
        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}
