package com.basicswithPc;

/*

 * * * *
 * * * *
 * * * *
 * * * *

 */
public class IterationExamples {

    public static void main(String[] args) {

        for (int j = 0; j < 4 ; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         1 2 3 4
         1 2 3 4
         1 2 3 4
         1 2 3 4
         */

        for (int j = 1; j <= 4 ; j++) {
            for (int i = 1; i <= 4; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
         */

        for (int i = 1; i <= 6 ; i++) {

            for (int j = 1 ; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        /*
        *
        * *
        * * *
        * * * *
        * * * * *
         */


        for (int i = 1; i <= 6 ; i++) {

            for (int j = 1 ; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        A
        A B
        A B C
        A B C D
         */

        for (int i = 1; i <= 4; i++) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        /*
        $ $ $ $
        $     $
        $     $
        $ $ $ $
         */

        for (int i = 1; i <= 4 ; i++) {

            for (int j = 1; j <= 4; j++) {

                if (i == 1 || i == 4 || j == 1 || j == 4 ) {
                    System.out.print("$ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        /*
        * * * * *
        * *   * *
        *   *   *
        * *   * *
        * * * * *
        */

        int m = 5; int n = 5;

        //row
        for (int i = 1; i <= m ;i++) {
            //columns
            for (int j=1; j<=n ; j++) {
                if (i == 1 || i == m || j == 1 || j == n || j == i || j == n - (i - 1) )  {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
