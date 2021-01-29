package com.basicswithPc;

public class SelectionDemo {

    /*
      if, if else, else if
      switch and ternary operator
     */
    public static void main(String[] args) {

        //check even or odd

        int n = 7;
        if (n == 0) {
            System.out.println("Neither even nor odd");
        } else if (n%2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        //ternary operator
        //?:  -> condition?expr1:expr2 (if condition is true , expression1 will be executed else expression2 will be executed

        int k = 8;
        int l = 0;
//
//        if (k > 8)
//            l=2;
//        else
//            l=4;
        //instead

        l = (k > 6) ? 2 : 4;

        System.out.println(l);

        //switch

        //supports int,double and string (after > 1.7 java)

        int value = 8;

        switch(value)
        {
            case 1 :
            System.out.println("One");
            break;
            case 2:
            System.out.println("Second");
            break;
            case 3:
            System.out.println("Third");
            break;
            case 4:
            System.out.println("Four");
            break;
            case 5:
            System.out.println("Five");
            break;
            default:
                System.out.println("No Match");
        }

    }
}
