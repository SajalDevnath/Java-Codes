package com.javacodes;
import java.util.Scanner;
public class Student {
    String name;
    int roll;
    double[] marks;
    Student(String nam, int r, double m[]){
        name = nam;
        roll = r;
        marks = m;
        System.out.println("Student created");
    }
    double avg(){
        int l = marks.length;
        double avrg = 0.0;
        for(int i = 0; i < l; i++)
            avrg += marks[i];
            avrg = avrg/l;
            return avrg;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+roll);
        System.out.println("Avg marks: "+avg());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nam;
        System.out.println("Enter name: ");
        nam = sc.nextLine();
        Student s1 = new Student(nam, 1, new double[]{86, 92, 59});
        Student s2 = new Student("Aman", 2, new double[]{51, 65.5, 75});
        s1.display();
        s2.display();
    }
}
