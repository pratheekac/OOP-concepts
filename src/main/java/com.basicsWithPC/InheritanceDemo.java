package com.basicswithPc;

class Car {  //super,parent,base    - //IS-A

    public void drive () {
        System.out.println("Brrrrrmmmmm brrommmmm");
    }

    public void horn () {
        System.out.println("Hoooooorrn");
    }
}

class Mahindra extends Car {  //sub,child,derived

    void park () {
        System.out.println("Paaarking");
    }

}

class TataMotors extends Mahindra {

    void airbags() {
        System.out.println("Airbags Open");
        }

}

public class InheritanceDemo {  //HAS-A

    public static void main(String[] args) {
        TataMotors tata = new TataMotors();

        tata.drive();
        tata.airbags();
        tata.horn();
        tata.park();
    }
}
