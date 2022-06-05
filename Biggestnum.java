package com.javacodes;

import java.util.Scanner;

public class Biggestnum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // for 3 digits
//        if (a > b) {
//            if (a > c) {
//                System.out.println(a);
//            } else
//                System.out.println(c);
//        } else {
//            if (b > c) {
//                System.out.println(b);
//            } else {
//                System.out.println(c);
//            }
//        }

        // for 4 digits

        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println(a);
                }else{
                    System.out.println(d);
                }
            }else{
                if(c>d){
                    System.out.println(c);
                }else{
                    System.out.println(d);
                }
            }
        }else{
            if(b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}
