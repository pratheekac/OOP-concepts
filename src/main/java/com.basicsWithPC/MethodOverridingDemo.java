package com.basicswithPc;

class Paint {
    void draw () {
        System.out.println("In class paint");
    }
}

class Acrylic extends Paint {

    @Override
    void draw() { //first priority is given to the class whose object is created/

       // super.draw(); //both parent and child class methods will be executed
        System.out.println("In class acrylic");
    }
}

class Watercolor extends Paint {
    void draw() {
        System.out.println("Watercolor drawing");
    }
}


public class MethodOverridingDemo {
    public static void main(String[] args) {
        Acrylic acrylic = new Acrylic();
        acrylic.draw();

        //compile time and runtime polymorphysim


        Paint p = new Acrylic(); //Runtime Polymorphism
        p.draw();

        p = new Watercolor();
        p.draw(); //Dynamic method dispatch
    }
}
