package com.basicswithPc;

/*
Multiple inheritance is not allowed in java, Because it will cause ambiguity issues
 */

class A{
   void drive (){

    }
}

class B{
    void drive (){

    }
}

class C extends A{

}

//class C extends A,B {
//
//}

public class MultipleInheritanceProblems {

    C c = new C();
    //c.drive(); //problem arises as to which drive method should be executed.

}
