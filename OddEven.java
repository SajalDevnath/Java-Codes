package com.javacodes;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner myclass = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num = myclass.nextInt();
        int odd = 0, even = 0;
        while(num != 0){
            int rem = num % 10;
            if(rem%2 == 1)
                odd++;
            else
                even++;
            num/=10;
        }
        System.out.println("Number of Even digits = " + even);
        System.out.println("Number of Odd digits = " + odd);
        myclass.close();
    }
}
