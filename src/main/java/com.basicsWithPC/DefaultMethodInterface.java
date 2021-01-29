package com.basicswithPc;

//abstract - define and declare method
//interface - declare till 1.7

//but in 1.8 , we can even define

/*
 adding default method can create ambiguity issue. Since two interfaces with same methods can be implemented by the class
 */

/*
We can also have static method
 */

/*
Variable declared inside the interface will become a constant - final
 */

interface Animal {

    void eat();
    default void drink(){ //default method
        System.out.println("Drinking water");
    }
}

interface LivingBeing {
    default void drink(){ //default method
        System.out.println("Drinking water - Living being");
    }
    static void breathe () {
        System.out.println("Breathing...");
    }
}
class Dog implements Animal,LivingBeing {

    @Override
    public void eat() {
        System.out.println("Eating");
    }
//    @Override
//    public void drink() {
//        System.out.println("Drinking - Dog");
//    }

    @Override
    public void drink() {
        Animal.super.drink();  //important
    }
}
public class DefaultMethodInterface {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.drink();
        animal.eat();
        LivingBeing.breathe();
    }
}
