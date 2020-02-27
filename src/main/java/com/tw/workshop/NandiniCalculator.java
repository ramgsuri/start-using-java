package com.tw.workshop;

public class NandiniCalculator {
    private int input1;
    private int intput2;
    private String calOperator;

    public NandiniCalculator() {

    }

    public NandiniCalculator (int var1 , int var2 , String operation) {
        this.input1 =var1;
        this.intput2 =var2;
        this.calOperator =operation;

    }

    public int calAdd() { return input1 + intput2; }
    //public int calSub() {return input1 - intput2; }
    //public int calmult() {return input1 * input2; }
    //public int caldiv() {return input1 / intput2;}


    public static void  main (String args){
        NandiniCalculator result1 = new NandiniCalculator(2,  1, "+") ;
        //if result1.calOperator = + then
        int result = result1.calAdd();

        System.out.println("The Sum is" +result);

    }
}
