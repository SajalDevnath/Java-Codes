package com.javacodes;
import java.util.Scanner;
public class Replacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        char ch;
        int l = s.length();
        String newStr = "";
        for(int i = 0; i < l; i++){
            ch = s.charAt(i);
            if(ch == ' ')
                    newStr += '_';
            else
                newStr += ch;
        }
        System.out.println("New string: "+ newStr);
        System.out.println(s.replace(' ','_'));
    }
}
