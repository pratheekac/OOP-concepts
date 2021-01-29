package com.basicswithPc;

public class IterationDemo {

    /*
    looping statements
    while, do while, for, for each loop(enhanced for)
     */
    public static void main(String[] args) {

        //execute the same statement multiple times

        int count = 9; //initialising statement
        //while
        while (count <= 5) { //condition
            System.out.println("Hello");
            count++; //increment/decrement
        }

        //do while
        //if we want to execute the statement atleast once
        do {
            System.out.println("Hello");
            count++;
        } while (count <= 5);


        //for loop

        //when to use: when we know the starting and ending point
        for (int i = 1; i <= 2; i++) {
            System.out.println("Hello");
        }
    }
}
