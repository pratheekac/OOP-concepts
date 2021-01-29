package com.basicswithPc;

/*
Static (variable and method)

Static block - it will be only executed once per class. So the assignment of static variable need not be done inside a constructor since it creates unnecessary memory(redundant)

to access static variable we dont need to create an object.
 */

class Student {

    //students have common/same teacher

    int sid;
    int marks;

    /* static variable will be common for all object and it will not be object specific

       memory will be assigned in the class loader memory not the heap memory
     */
    static String teacher;

    //constructor (default)
    //if we want to initialise a non static variable we can use construtor
    //executed when we create a object
    public Student() {
        sid = 2;
        marks = 80;
    }

    //static block
    //executed when we load a class(thats only once)

    //only static variable can be accessed inside static method
    static {
        teacher = "Veena";
    }

    public void show() {
        System.out.println(marks+ ":" +sid+":"+teacher);
    }

}

public class StaticDemo {

    public static void main (String[] args) {

        Student prathee = new Student();
//        prathee.sid = 1;
//        prathee.marks = 80;
//        prathee.teacher = "Vijay";

        Student chandran = new Student();
//        chandran.sid = 2;
//        chandran.marks = 90;
//        chandran.teacher = "Vijay";

        /*
        you can use the class name instead of object name
         */

       // Student.teacher = "Veena";

        chandran.show();
        prathee.show();

    }
}

