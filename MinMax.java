package com.javacodes;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("\n Enter Size of Array: ");
        int n=inp.nextInt();
        int i,sum=0;
        int arr[]=new int[n];

        for(i=0;i<n;i++)
        {
            System.out.print("\n Enter: ");
            arr[i]=inp.nextInt();
        }

        int max=arr[0],min=arr[0];

        for(i=0;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];

            if(arr[i]<min)
                min=arr[i];

        }
        System.out.println("\n Maximum Number: "+max);
        System.out.println("\n Minimum Number: "+min);
    }

}
