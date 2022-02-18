package com.javacodes;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
public class Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet ts = new TreeSet();
        ArrayList al = new ArrayList();
        System.out.println("Enter the number of names: ");
        int n = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        System.out.println("Enter the names: ");
        for(int i = 0; i < n; i++){
            ts.add(sc.nextLine());
        }
        al.addAll(ts);
        System.out.println(al);
        System.out.println("Third student: "+ al.get(2));
        System.out.println("Fifth student: "+ al.get(4));
    }
}
