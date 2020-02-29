package com.tw.workshop;
public class NandiniCalculator {
    private int input1;
    private int input2;
    private String calOperator;
    public void setInput1(int input1){
        this.input1=input1;

    }
    public void setInput2(int input2){
        this.input2=input2 ;

    }
    public int getnumber1(){
        return this.input1;

    }
    public int getnumber2(){
        return this.input2;
    }

    public NandiniCalculator() {

    }
    public NandiniCalculator (int var1 , int var2 ) {
        this.input1 =var1;
        this.input2 =var2;

    }
    public int calAdd() { return input1 + input2; }
    public int calSub() {return input1 - input2; }
    public int calMult() {return input1 * input2; }
    public int caldiv() {return input1 / input2;}
    public int calmod() { return input1 % input2;}

    public static void  main (String args[]){

        System.out.println("calculator Name is " +args[0]);
        System.out.println("calculator Name is " +args[1]);// to take input from user use the edit config
        //for loop also can be used to print the above the values
        for (int i =0; i<args.length; i++) {
            System.out.println("hello");
        }

        NandiniCalculator result1 = new NandiniCalculator( ) ;
        //if result1.calOperator = + then
        result1.setInput1(10);
        result1.setInput2(50);
        System.out.println("Input 1 is " +result1.getnumber1());
        System.out.println("Input 2 is " +result1.getnumber2());

        int result = result1.calAdd();
        System.out.println("The Sum is  " +result);
        result =result1.calSub();
        System.out.println("The Difference is  " +result);
        result = result1.calMult();
        System.out.println("The Product is " +result);
        result=result1.caldiv();
        System.out.println("The quotient  is " +result);
        result = result1.calmod();
        System.out.println("The Modulus is " +result);


    }
}
