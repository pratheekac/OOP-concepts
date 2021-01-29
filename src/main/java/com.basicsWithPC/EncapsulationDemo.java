package com.basicswithPc;

/*
Encapsulation is accessing/binding data with the help of getters and setters.
 */


class Emp {
    private int empId;
    private String name; //both are given private access and cant be used by calling directly

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class EncapsulationDemo {

    public static void main(String[] args) {
        Emp e = new Emp();
        e.setEmpId(1);
        e.setName("Pratheeka");
        System.out.println(e.getName()+ " "+e.getEmpId());
    }
}
