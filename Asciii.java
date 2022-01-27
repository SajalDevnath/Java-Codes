package com.javacodes;
import java.util.Scanner;
public class Asciii {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character whose ASCII value you want to know: ");
        char ch=sc.next().charAt(0);
        int value=ch;
        System.out.println("Character is "+ch+" and ASCII value is "+ value);
    }
}
