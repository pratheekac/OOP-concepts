package com.basicswithPc;

/*
try, try catch finally, try with multiple catches, try with resources
 */

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandlingDemo  {
    public static void main(String[] args) {

        try {
            int i = 12;
            int j = 0;

            int k = i / j;
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            //for all possible exceptions
        }

        finally {
            //this block will be executed irrespective of any exception arised

            //best way to use it is, to close any resources (IO resources like BufferedReader etc)
        }
//
//        try(BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in))//mention the resource) {
//
//        }


        //custom Exception




    }
}
