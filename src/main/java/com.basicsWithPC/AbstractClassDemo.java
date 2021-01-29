package com.basicswithPc;

/*
 Abstract class is a class in java

 Eg; Number is abs class, Integer extends Number

 cannot create object/instantiate the anstract class
 it can have abstract methods and normal methods
 -> if atleast one abstract method is in a class, then the entire class should be declared abstract
 -> if another concrete class extends this abstract class, then the abstract method should be implemented, else that class also should be made abstract
 */

abstract class Bike{
    abstract void ride();
    void wheeling(){
        System.out.println("Wheeeeeling");
    }
}

class RoyalEnfield extends Bike {

    @Override
    void ride() {
        System.out.println("Riiiddding....dubu dubu dubu");
    }
}
public class AbstractClassDemo {

    public static void main(String[] args) {

        Bike bike = new RoyalEnfield();
        bike.ride();
        bike.wheeling();

    }

}
