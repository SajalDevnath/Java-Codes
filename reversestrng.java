package com.javacodes;
import java.util.Scanner;
public class reversestrng {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original string : ");

        String originalStr = scanner.nextLine();
        scanner.close();

        String words[] = originalStr.split("\\s");
        String reversedString = "";

        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.print("Reversed string : " + reversedString);
    }
}
