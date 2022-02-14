package com.javacodes;
import java.util.Scanner;
public class Capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.next();
        String newWord = "";
        int l = word.length();
        for( int i = 0; i < l; i++){
            if(i%2 == 0)
                newWord += Character.toUpperCase(word.charAt(i));
            else
                newWord += Character.toLowerCase(word.charAt(i));
        }
        System.out.println(newWord);
    }
}
