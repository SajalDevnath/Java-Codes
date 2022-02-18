package com.javacodes;
import java.util.HashMap;
import java.util.Scanner;
public class PhoneBook {
    public static void main(String[] args) {
        HashMap book = new HashMap<String,Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of records: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            System.out.println("Enter name and number" + i);
            book.put(sc.nextLine().toLowerCase(),sc.nextInt());
            sc.nextLine();
        }
        String name;
        while(true){
            System.out.println("Enter the name to be searched: ");
            name = sc.nextLine().toLowerCase();
            if(name == "")
                break;
            if(book.containsKey(name))
                System.out.println("Number found: " + book.get(name));
            else
                System.out.println("Name not found");
        }
    }
}
