package com.basicswithPc;
/*
 WHen two threads are accessing a method at the same time, there will arise conflict and the output will be wrong
 Hence that method can be made synchronised

 */

class Counter {
    int count;
    public synchronized void increment () {  //syncronized will allow the method access for one thread at a time
        count ++ ;
    }
}
public class SynchronizationDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(() ->
        {
            for (int i = 0; i<1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() ->
        {
            for (int i = 0; i<1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        System.out.println("Count " +counter.count);
    }
}
