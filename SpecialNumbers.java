package com.javacodes;
import java.util.Scanner;
public class SpecialNumbers {
    boolean isArmstrong(int n){
        int a,sum = 0, temp = n;
        while(n>0){
            a = n%10;
            n=n/10;
            sum = sum+(a*a*a);
        }
        if(temp == sum)
            return true;
        else
            return false;
    }
    boolean isPerfect(int n){
        int sum = 1;
        for (int j = 2; j <= n/2; j++){
            if(n%j == 0){
                sum = sum +j;
            }
        }
        if(sum == n&& n!= 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpecialNumbers sn = new SpecialNumbers();
        System.out.println("Enter the begin and end limits");
        int begin = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Armstrong numbers");
        for(int i = begin; i <= end; i++){
            if(sn.isArmstrong(i))
                System.out.println(i + "");
        }
        System.out.println("Perfect numbers");
        for(int i = begin; i <= end; i++){
            if(sn.isPerfect(i))
                System.out.println(i + "");
        }
    }
}
