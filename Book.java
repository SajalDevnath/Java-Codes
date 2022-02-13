package com.javacodes;
import java.util.Scanner;
public class Book {
    String title, author, publisher;
    double price;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n = sc.nextInt();
        Book[] b = new Book[n];

        for (int i = 0; i < n; i++) {
            b[i] = new Book();
            sc.nextLine();
            System.out.println("Enter the title of book" + (i + 1));
            b[i].title = sc.nextLine();
            System.out.println("Enter the author of book" + (i + 1));
            b[i].author = sc.nextLine();
            System.out.println("Enter the publisher of book" + (i + 1));
            b[i].publisher = sc.nextLine();
            System.out.println("Enter the price of book" + (i + 1));
            b[i].price = sc.nextDouble();
        }
        System.out.println("Books written by Rowling: ");
        for (int i = 0; i < n; i++) {
            if (b[i].author.equalsIgnoreCase("Rowling"))
                System.out.println(b[i].title);
        }
        System.out.println("Books written by Penguin: ");
        for (int i = 0; i < n; i++) {
            if (b[i].author.equalsIgnoreCase("Penguin"))
                System.out.println(b[i].title);
        }
        System.out.println("Books worth more than 500: ");
        for (int i = 0; i < n; i++) {
            if (b[i].price > 500.0)
                System.out.println(b[i].title);
        }
    }
}