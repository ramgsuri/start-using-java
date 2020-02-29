package com.tw.workshop;

import Interfaces.Reports;

import java.util.Date;

public class EmplMgmtSystem {
    public static void main (String args[]) {
//        String name="Nandini";
//        Date joiningDate=new Date();
//        partTimeEmployee partTimeEmployee =new partTimeEmployee(name, joiningDate);
//        partTimeEmployee.Join();

        Reports form16report = new Form16Report();
        form16report.generateReports();
        form16report.printReport();


    }


}
