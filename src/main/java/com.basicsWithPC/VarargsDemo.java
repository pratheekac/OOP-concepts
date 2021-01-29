package com.basicswithPc;

//Variable length arguments

/*
 sometimes we need to determine the parameters to be passed in a dynamic way, so instead of using fixed params, we will treat it like an array.
 */

class Calculator {

    public int add(int ... n) { //array //variable length arguments

        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }
}
public class VarargsDemo {

    public static void main(String[] args) {


        Calculator calc = new Calculator();
        int sum = calc.add(1,2,12,34,56,677);
        System.out.println(sum);
    }
}
