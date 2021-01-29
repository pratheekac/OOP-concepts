package com.basicswithPc;

class D{

    void run() {
        System.out.println("In D");
    }
}

//to override the run method - the only objective

//but just to override we need not create a new class
class E extends D {

    void run(){
        System.out.println("Runninggg..");
    }
}
public class AnonymousClassDemp {

    public static void main(String[] args) {
//        D d = new E();
//        d.run();

        D d = new D() {  //Anonymous class - class without name
            void run(){
                System.out.println("Runnninngggg...");
            }
        };

        d.run();
    }

}
