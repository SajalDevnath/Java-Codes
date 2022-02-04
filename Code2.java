package com.javacodes;
import java.util.Scanner;
public class Code2 {
    public static void main(String[] args) {
        System.out.println("Your speed ?");
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        System.out.println("Its your birthday today True/False ?");
        boolean check = sc.nextBoolean();
        if(check){
            speed-=5;
        }
        if(speed > 80){
            System.out.println("high ticket");
        }
        else if( speed <= 80 && speed >= 60){
            System.out.println("Mid ticket");
        }
        else{
            System.out.println("Low ticket");
        }
    }
}
