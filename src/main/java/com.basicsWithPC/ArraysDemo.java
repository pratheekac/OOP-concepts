package com.basicswithPc;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] nums = new int[4];

        //can also be done for objects (eg : Student[] arr = new Student[4])
        //array will be created in heap with inial value as 0, since its a int array

        nums[0] = 56;
        nums[1] = 12;
        nums[2] = 7;
        nums[3] = 89;

        System.out.println(nums[0]);

        for (int i = 0 ; i < 4; i++ ){
            System.out.println(nums[i]);
        }
        //System.out.println(nums[5]); //array out of bound exception

        //2 Dimentional Array

        int[] a = {1,2,3,4};
        int[] b = {2,3,4,5};
        int[] c = {5,6,7,8};

        //2d
        int[][] d = {
                {1,2,3,4}, //row1
                {2,3,4,5}, //row2
                {5,6,7,8} //row3
                     } ;

        System.out.println(d[0][1]); //2

        //to print all the elements

        for (int i=0; i < 3;i++) {
            for (int j=0; j< 4;j++) {
                System.out.print(" "+d[i][j]);
            }
            System.out.println();
        }

        //jagged array
        int[][] jaggedArray = {
                {1,2,3,4}, //row1
                {2,3,4}, //row2
                {5,6,7,8,9} //row3
        } ;

        System.out.println(d[0][1]); //2

        //to print all the elements

        for (int i=0; i < jaggedArray.length;i++) {
            for (int j=0; j< jaggedArray[i].length;j++) {
                System.out.print(" "+jaggedArray[i][j]);
            }
            System.out.println();
        }


    }
}
