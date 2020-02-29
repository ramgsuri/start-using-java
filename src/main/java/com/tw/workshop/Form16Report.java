package com.tw.workshop;

import Interfaces.Reports;

public class Form16Report implements Reports {


    @Override
    public void generateReports() {
        System.out.println("inside Form16 GenerateReport");
    }

    @Override
    public void printReport() {
        System.out.println("inside Form16 PrintReport");
    }



}
