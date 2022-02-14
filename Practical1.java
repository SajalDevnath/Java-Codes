package com.javacodes;
import java.util.Scanner;
public class Practical1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String word;
        int l = words.length;
        System.out.println("The number of words: "+ l);
        for(int i = 0; i < l; i++){
            word = words[i];
            if(word.length()%2 == 0){
                System.out.println(word);
            }
        }
    }
}
