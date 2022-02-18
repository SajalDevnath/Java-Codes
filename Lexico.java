package com.javacodes;
import java.util.Scanner;
import java.util.TreeSet;
public class Lexico {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the names: ");
        for(int i = 0; i < n; i++){
            names.add(sc.nextLine());
        }
        System.out.println(names);
        System.out.println("Smallest name: "+ names.first());
        System.out.println("Largest name: "+ names.last());
    }
}
