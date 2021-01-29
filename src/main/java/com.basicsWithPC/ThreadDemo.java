package com.basicswithPc;

import java.awt.*;

//class Hi extends Thread{
//    public void run() {
//        for(int i = 0; i < 5 ; i++) {
//            System.out.println("Hi");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class Hello extends Thread{
//
//    public void run() {
//        for(int i = 0; i < 5 ; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class Hi implements Runnable{
//    public void run() {
//        for(int i = 0; i < 5 ; i++) {
//            System.out.println("Hi");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class Hello implements Runnable{
//
//    public void run() {
//        for(int i = 0; i < 5 ; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException { //main thread
//
//        Hi obj1 = new Hi(); //runnable class cos it implements a runnable interface
//        Hello obj2 = new Hello();

        Runnable obj1 = () -> {
            for(int i = 0; i < 5 ; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
            for(int i = 0; i < 5 ; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


//        obj1.start();
//        obj2.start(); //start method is in thread, in runnable there is no start method
//        obj1.show();
//        obj2.show();

        //the methods inside a thread class should be run



        Thread t1 = new Thread(() ->
            {
                for(int i = 0; i < 5 ; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        Thread t2 = new Thread(() ->
        {
            for(int i = 0; i < 5 ; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
//        t1.start();
//        t2.start();
//        obj1.run();
//        obj2.run();

        //naming the thread

        System.out.println(t1.getName());

        System.out.println(t2.getName());


        t1.start();
        t2.start();

        //how to set the priority for threads


        System.out.println(t1.getPriority()); //where 1 is least priority and 10 is highest riority

        System.out.println(t2.getPriority());

        System.out.println(t1.isAlive()); //if the thread is in running state or not
        t1.join();
        t2.join();//make the main thread wait

        System.out.println("Bye");

    }
}
