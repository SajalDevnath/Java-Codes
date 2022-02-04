package com.javacodes;

class Dog {
    String name, breed;
    int age;
    private void bark(){
        System.out.println(name +" is barking");
    }
    private void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public static void info(Dog dog){
        System.out.println("name "+dog.name+" breed "+dog.breed+" age "+dog.age);
    }

}
public class Day3 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "stacy";
        d1.breed = "Tibetan Mastiff";
        d1.age = 4;
        Dog.info(d1);
    }
}
