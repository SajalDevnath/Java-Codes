package com.javacodes;
import java.util.Scanner;
public class Vowelsreplace {
    public static void main(String[] args){
        String str1, str2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Word : ");
        str1 = scan.nextLine();

        str2 = str1.replaceAll("[aeiouAEIOU]", "");

        System.out.print("All Vowels Removed Successfully..!!\nNew Word is : ");

        System.out.print(str2);
    }
}
