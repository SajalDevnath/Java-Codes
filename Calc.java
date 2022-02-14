package com.javacodes;

public class Calc {
    int add(int a, int b){
        System.out.println("From method 1");
        return a + b;
    }
    double add(int a, double b){
        System.out.println("From method 2");
        return a + b;
    }
    double add(double a, int b) {
        System.out.println("From method 3");
        return a + b;
    }
    double add(double a, double b) {
        System.out.println("From method 4");
        return a + b;
    }

    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2,3.7));
        System.out.println(c.add(2.5,3));
        System.out.println(c.add(2.5,3.7));
    }
}
