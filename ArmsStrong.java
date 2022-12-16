package com.javacodes;
import java.util.Scanner;

public class ArmsStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArm(n));
    }
    static boolean isArm(int n){
        int number = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
//        if(n == number){
//            return true;
//        }
//        return false;
        return sum == number;
    }
}
