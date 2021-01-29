package com.basicswithPc;

//Super method working
class P
{
    public P() {
        System.out.println("In P default constructor");
    }


    public P(int i) {
        System.out.println("In P int constructor");
    }
}

class Q extends P
{
    public Q() {

        //by default, the child class will call th super() method

        super();
        System.out.println("In Q default constructor");
    }

    //parameterised cons

    public Q (int i) {
        super(8); //by default it will call the default constr of P class, But if the parameter is explicitly passed to super method it will call the param cons
        System.out.println("In Q int constructor");
    }

}

public class SuperMethodDemo {

    public static void main (String[] args) {

        Q q = new Q(1);
    }
}
