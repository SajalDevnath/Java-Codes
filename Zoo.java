package com.javacodes;

 abstract class Animal{
    String name;
    abstract void makeSound();
    public void walk(){
        System.out.println(name + "is walking");
    }
}

class dog extends Animal{
    dog(){
        name = "Dog";
    }
    @Override
    void makeSound(){
        System.out.println(name + "is barking");
    }
}

class lion extends Animal{
    lion(){
        name = "Lion";
    }
    @Override
    void makeSound(){
        System.out.println(name + "is roaring");
    }
}
 class Zoo {
    public static void main(String[] args) {
        dog d = new dog();
        lion l = new lion();
        d.walk();
        d.makeSound();
        l.walk();
        l.makeSound();
    }
}
