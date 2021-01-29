package com.basicswithPc;

/*
 Inner class

  - member class - a normal class inside the class.
  - static class - a class inside a class can be static, the object of static class can be created directly using the outer class.
  - anonymous clas
 */
class Outer { //Outer.class

    //A class can have variables, methods and another class
    int a;
    String name;


    public void show() {

    }

    class Inner { //Outer$Inner.class
        int a;
        String name;
        public void display() {
            System.out.println("Inside inner class");
        }
    }

    static  class StaticClass {

        int q;
        public void message() {
            System.out.println("In the static class");
        }
    }

}
public class InnerClassDemo { //InnerClassDemo.class

    public static void main(String[] args) {

        Outer obj = new Outer();

        obj.show();

        Outer.Inner obj1 = obj.new Inner(); //member class
        obj1.display();

        Outer.StaticClass obj12 = new Outer.StaticClass(); //static inner class
        obj12.message();
    }
}
