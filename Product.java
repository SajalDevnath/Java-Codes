package com.javacodes;

public class Product {
    String name;
    int code;
    double amt;

    Product(String nam, int c, double p){
        name = nam;
        code = c;
        amt = p;
    }
    void show(){
        System.out.println("Product details: ");
        System.out.println("Name: "+ name);
        System.out.println("item code: "+code);
        System.out.println("Amount: "+amt);
    }
}

class sales extends Product{
    int days, fine = 10;
    double totAmt;

    sales(String nam, int c, double p, int d){
        super(nam, c, p);
        days = d;
    }
    void compute(){
        totAmt = amt + days*fine;
    }
    void show(){
        super.show();
        System.out.println("Days: "+ days);
        System.out.println("Fine: "+ fine);
        System.out.println("Total amount: "+totAmt);
    }

    public static void main(String[] args) {
        sales s = new sales("Laptop",1432,60000.00,5);
        s.compute();
        s.show();
    }
}
