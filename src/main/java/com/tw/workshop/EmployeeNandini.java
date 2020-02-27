package com.tw.workshop;

public class EmployeeNandini {
    private String employeeName;
    private int employeeId;
    public EmployeeNandini() {

    }
    public EmployeeNandini(String name, int employeeId) {
        this.employeeName =name;
        this.employeeId=employeeId;


    }

    public String getName() {
        return this.employeeName;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }
///
    public static void main (String args[]) {
        EmployeeNandini employee1= new EmployeeNandini("Nandini",    1);
        String name =employee1.getName();
        System.out.println("My name is " +name + employee1.getEmployeeId());

    }


}
