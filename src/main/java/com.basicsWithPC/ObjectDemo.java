package com.basicswithPc;

/*
  Constructor
  this keyword
 */
class Calc {
    int num1;
    int num2;
    int result; //instance variable

    public int perform(int extra,int k) { //local variable
        result = num1 + num2 * (extra) + k;
        return result;
    }

    public Calc (int num1, int num2) {
//        num1 = num1;
//        num2 = num2; //returns 0 because the local variable num1 and num2 is set to itself

        //this will specify the variable of the object created
        this.num1 = num1;
        this.num2 = num2;

    }

    /*
    Constructor - same name as class name
    it doesnt return any value
    its called automatically

    We can have two constructor in same class but the parameters cannot be same. This is called as Constructor overloading

     */
    public Calc() {
        num1 = 1;
        num2 = 3;
        result = num1+num2;
    }

    public Calc(int r) {
        num1 = r;
        num2 = r;
        result = num1+num2;
    }

}

public class ObjectDemo {

    public static void main(String[] args) {
        Calc calc = new Calc(5);
        //Constructor (Default constructor will be called during object creation)
        /* the deafult constructor is only used to allocate the memory

         */
        // object - has something and knows something
//        calc.num1 = 3;
//        calc.num2 = 5;
//
//        calc.perform(1,3);


        Calc calc1 = new Calc(2,4);

        System.out.println(calc.result);

        System.out.println(calc1.num1);

        System.out.println(calc1.num2);

    }
}
