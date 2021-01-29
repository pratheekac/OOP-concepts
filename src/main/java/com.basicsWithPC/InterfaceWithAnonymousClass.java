package com.basicswithPc;


interface Cat {
    void meow();
    void eat();
}
public class InterfaceWithAnonymousClass {

    public static void main(String[] args) {
        Cat c = new Cat() {
            @Override
            public void meow() {

            }

            @Override
            public void eat() {

            }
        };  //interface obj cannot be created but anonymous class implementaion can be done
        //adv : less memory consumption
    }
}
