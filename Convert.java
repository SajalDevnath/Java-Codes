package com.javacodes;
import java.util.Scanner;
public class Convert {
    double kmToMetre(double km){
        return(km*1000);
    }
    double metreToKm(double m){
        return(m/1000);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m,km;
        Convert c = new Convert();
        System.out.println("Enter the value in metre: ");
        m = sc.nextDouble();
        System.out.println("Kilometre value = " + c.metreToKm(m));
        System.out.println("Enter the value in kilometre: ");
        km = sc.nextDouble();
        System.out.println("Metre value = " + c.kmToMetre(km));
    }
}
