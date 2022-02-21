package com.javacodes;
import java.util.Arrays;
import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String[] words = sc.nextLine().split(" ");
        int count = (int) Arrays.stream(words)
                .filter(s->s.length()>4)
                .count();
        System.out.println(count);
        Arrays.stream(words)
                .filter(s->s.toLowerCase().startsWith("a"))
                .map(s->s.toUpperCase())
                .forEach(s->System.out.print(s+ " "));
    }
}
