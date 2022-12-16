package com.javacodes;

import javax.xml.namespace.QName;

public class Overloading {
    public static void main(String[] args) {
        fun(99);
        fun("Sajal Devnath");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
