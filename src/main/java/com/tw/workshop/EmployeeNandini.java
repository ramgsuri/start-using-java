package com.tw.workshop;

import java.util.Date;

public class EmployeeNandini {
    private String employeeName;
    //private int employeeId;
    private Date joiningdate;
    public EmployeeNandini() {

    }
    public EmployeeNandini(String name, Date joiningDate) {
        this.employeeName =name;
        //this.employeeId=employeeId;
        this.joiningdate=joiningDate;


    }
    public void Join(){
        System.out.println("joining Date" +this.joiningdate);
    }

    public String getName() {
        return this.employeeName;
    }

//    public int getEmployeeId() {
//        return this.employeeId;
//    }
///
//    public static void main (String args[]) {
//        EmployeeNandini employee1= new EmployeeNandini("Nandini",    1);
//        String name =employee1.getName();
//        System.out.println("My name is " +name + employee1.getEmployeeId());
//
//    }


}
