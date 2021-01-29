package com.basicswithPc;

public class OperaterDemo {

   /*
   Arithmetic +,-,*,/,%(modulus)

   Bitwise
   Relational
   Logical
    */

   public static void main(String[] args) {

       //example 1
       int m = 6; int n= 4;

       int r1 = m+n;
       int r2 = m-n;
       int r3 = m*n;
       int r4 = m/n; //this will always give the interger value(quotent)

       double r6 = m/n;
       double r7 = (double) m/n; //explicitly cast is required since bydefault division operator takes in the integer values
        int r5 = m%n; //remainder in the  division

       System.out.println(r1); //8
       System.out.println(r2); //4
       System.out.println(r3); //12
       System.out.println(r4);
       System.out.println(r6);//3
       System.out.println(r5);
       System.out.println(r7);

       //ex 2

       //Short hand operator

       int p = 5; int q = 6;


       p = p + q; //11

       p += q; //11

       //incremental operator

       p++;  //6

       p += 1; //6

       p = p + 1; //6

       //decremental operator
       p--;

       p -= 1;

       //difference between p++(post increment) and ++p(pre increment)

       int i = 2 ; int j = 3;

       i ++ ;

       System.out.println(i);

       i = ++j;

       System.out.println(j);
       System.out.println(i);









   }
}
