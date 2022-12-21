package com.javacodes;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {
    public static void main(String[] args) {
        // syntax
        // ArrayList<datatypes> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)); // pass the index
        }
        System.out.println(list);
    }
}
