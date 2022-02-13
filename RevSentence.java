package com.javacodes;
import java.util.Scanner;
import static java.lang.String.join;
public class RevSentence {
    static String rev(String s){
        char[] strArray = s.toCharArray();
        String rev = "";
        for(int i = strArray.length - 1; i >= 0; i--)
            rev = rev + strArray[i];
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");

        for(int i = 0; i < words.length; i++){
            words[i] = rev(words[i]);
        }
        String rev = join(" ",words);
        System.out.println(rev);
    }
}
