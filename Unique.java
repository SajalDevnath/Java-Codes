package com.javacodes;
import java.util.Scanner;
public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int index = -1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                index = s.indexOf(ch);
                break;
            }
        }
        if(index == -1)
            System.out.println("There are no unique characters.");
        else
            System.out.println("The first unique character is at index: "+index);
    }
}
