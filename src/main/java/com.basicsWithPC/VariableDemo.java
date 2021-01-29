package com.basicswithPc;

public class VariableDemo
{
    public static void main(String[] args) {
        //System.out.print("Hello World");

        //java is type safe language


        //naming convention - $ and _ is allowed, name should not start from a number

        int a = 600_000_00; // int - 32bits - 4bytes
        // we can also use underscores between numbers
        int b = 1;

        //a = 9;

        //default is double
        double c = 5.5;

        float d = 5.5f;

        //if you want to store a integer (eg 5) but do not want to waste a 32 bits using int datatype, use Short(2 bytes)

        short e = 5; //2bytes - 16bits

        byte f = 5 ; //-128 to 127

        long l = 5l; //8 bytes - 32 bits

        //char can be assigned with int values also, but it will print the character associated with that value(ASCII)
        char m = 'A';//American standard code for information interchange
        m++;

        double num = 5; //implicit conversion (assigning int value to double is allowed) - 5.0  \

        int k = ((int) 5.5); //explicit conversion
        System.out.print(k);


        System.out.print(m);
       // System.out.print(a+b);

    }
}
