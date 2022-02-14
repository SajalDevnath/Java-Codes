package com.javacodes;
import java.util.*;
public class Shape {
    Shape(){
        System.out.println("From super class");
    }
    Shape(int x){
        System.out.println(x);
    }
    void draw(){
        System.out.println("Name of the shape");
    }
    void sides(){
        System.out.println("Number of sides of the shape");
    }
}

class Square extends Shape{
    Square(){
        super(4);
        System.out.println("From square constructor");
    }
    void draw(){
        System.out.println("Shape is square");
    }
    void sides(){
        System.out.println("Square has 4 sides");
    }
}
class Tri extends Shape{
    void draw(){
        System.out.println("Shape is triangle");
    }
    void sides(){
        System.out.println("Triangle has 3 sides");
    }
}

class test{
    public static void main(String[] args) {
        Square s = new Square();
        Tri t = new Tri();

        s.draw();
        s.sides();

        t.draw();
        t.sides();
    }
}
