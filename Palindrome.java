package com.javacodes;
import java.util.Scanner;
public class Palindrome {
    static String rev(String s){
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--)
            rev = rev + s.charAt(i);
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.next();
        if(s.equalsIgnoreCase(rev(s)))
        System.out.println("Its a palindrome");
        else
        System.out.println("Its not a palindrome");
    }
}
