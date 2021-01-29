package com.basicswithPc;

/*
diff between abstract and interface???

multiple interfaces can be implemented

in java , a class cannot extend multiple classes, which can cause ambiquity, we can use interface
-> all methods in interface are by default public and abstract
-> it uses a keywprd called implements
-> a object of interface cannot be created, but a reference can be.


// we can create object of interface using anonymous class
 */


/*
Types of interface

1. normal - which has more than one methods
2. single abstract - only one abstract method Or functional Interface - Lambda Expression
3. Marker interface - no methods Eg - Serializable


 */

@FunctionalInterface //can have only one method
interface Furniture {
    void doSomething ();
}

class chair  implements Furniture{

    @Override
    public void doSomething() {

    }
}

class Bed implements Furniture{

    @Override
    public void doSomething() {
System.out.println("In bed");
    }
}
public class InterfacesDemo {

    public static void main(String[] args ) {

        Furniture b = new Bed();
        b.doSomething();


        //Using functial interface and Lambda functions

        Furniture f = ()->System.out.println("Lambda");
        f.doSomething();
    }



}
