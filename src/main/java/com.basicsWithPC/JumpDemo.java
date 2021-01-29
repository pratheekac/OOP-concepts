package com.basicswithPc;

public class JumpDemo {

    //break and continue
    public static void main(String[] args) {

        //continue will skip the for loop - for the condition mentioned

        //print 1 to 5 and skip the rest

        for (int i = 1; i <= 5; i++) {
            if (i > 5) {
                continue;
            }
            System.out.println("Number is "+i);
        }

        //break statement - will break the loop and not allow any further statement to be executed

    }
}
