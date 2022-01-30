package com.javacodes;
import java.util.Scanner;
public class ApplePattern {
    public static void main(String args[]){
        System.out.println("Enter a word: ");
        Scanner word = new Scanner(System.in);
        String s = word.nextLine();
        word.close();

        char[] a = s.toCharArray();
        for(int i = 0; i < a.length; i++){
            for(int j =0; j <=i; j++){
                System.out.print(a[j]);
            }
            System.out.println();
        }
    }
}
