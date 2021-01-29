package com.basicswithPc;

/*
Wrapper classes - Integer,Float etc

 */
public class WrapperClassDemo {

    public static void main(String[] args) {
        int i = 5; //primitive datatype

        Integer integer = new Integer(i); //boxing/wrapping

        int j = integer.intValue(); //unboxing

        Integer integer1 = 5; //autoboxing

        int k = integer1; //auto unboxing
    }
}
