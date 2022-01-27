package com.javacodes;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        double side1, side2, side3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Three sides of Triangle: ");
        side1 = sc.nextDouble();
        side2 = sc.nextDouble();
        side3 = sc.nextDouble();

        if((side1 + side2  >  side3) &&
                (side2 + side3 > side1) &&
                (side1 + side3 > side2)) {
            System.out.println("It is a Valid Triangle");
        }  else   {
            System.out.println("It is Not a Valid Triangle");
        }
    }
}
