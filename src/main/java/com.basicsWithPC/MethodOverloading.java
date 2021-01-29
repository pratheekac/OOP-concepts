package com.basicswithPc;

/*
  A class can have methods with same name, but different parameters. This is called as Method Overloading

  The same can be done with constructor - constructor overloading
 */
class Casio {
//
//    public Casio (){
//
//    }
//
//    public Casio(int w) {
//
//    }
    public void add(int i , int j) {
        System.out.println(i+j);
    }

    public void add(int i , int j,int k) {
        System.out.println(i+j+k);
    }

    public void add(double i , double k) {
        System.out.println(i+k);
    }
}

public class MethodOverloading {


    public static void main(String[] args) {
        Casio casio = new Casio();

        casio.add(1,2);

        casio.add(1,2,3);

        casio.add(1,3.9);
    }
}
