package com.javacodes;
import java.util.Scanner;
public class Area {
    double findArea(int side){
        return side*side;
    }
    double findArea(double l, double b){
        return l*b;
    }
    double findArea(double a, double b, double c){
        double semi = (a + b + c)/2;
        double Area = Math.sqrt(semi*(semi - a)*(semi - b)*(semi - c));
        return Area;
    }

    double findArea(double rad){
        return 3.14*rad*rad;
    }

    public static void main(String[] args) {
        Area ar = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int n = (int)a;
        System.out.println("Square: " + ar.findArea(2));
        System.out.println("Rectangle: " + ar.findArea(a,b));
        System.out.println("Triangle: " + ar.findArea(3,5.3,7.1));
        System.out.println("Circle: " + ar.findArea(b));
    }
}
