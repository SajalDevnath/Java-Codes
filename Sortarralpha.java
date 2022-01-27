package com.javacodes;
import java.util.Scanner;
import java.util.Arrays;
public class Sortarralpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Names: ");
        n=sc.nextInt();

        String names[]=new String[n];
        System.out.println("Enter the Names ");
        Scanner sc1=new Scanner(System.in);
        for(int i=0; i<n ;i++)
        {
            names[i]=sc1.nextLine();
        }

        for(int i = 0; i<n; i++)
        {
            for (int j = i+1; j<n; j++)
            {

                if(names[i].compareTo(names[j])>0)
                {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }
}
