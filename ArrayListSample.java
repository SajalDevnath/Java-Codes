package com.javacodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayListSample {
    ArrayList<Integer> al;
    ArrayListSample(){
        al = new ArrayList<Integer>();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayListSample ob = new ArrayListSample();
        ob.addElement();
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        ob.printMultiples(x);
        System.out.println("\nEnter search element: ");
        ob.searchElement(sc.nextInt());
    }
    private void searchElement(int n){
        if(al.indexOf(n) == -1)
            System.out.println("Element is not found.");
        else
            System.out.println("Element found at index" + al.indexOf(n));
    }
    private void printMultiples(int n){
        Iterator<Integer> it = al.iterator();
        System.out.println("Multiples of" +n+": ");
        while(it.hasNext()){
            int a = it.next();
            if(a%n == 0){
                System.out.println(a + " ");
            }
        }
    }
    private void addElement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be added: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i = 1; i <= n; i++){
            al.add(sc.nextInt());
        }
        System.out.println("Elements added");
    }
}
