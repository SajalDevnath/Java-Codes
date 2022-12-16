package com.javacodes;
import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }

    static String greet(){
        String greeting = "My name is Sajal";
        return greeting;
    }
}
