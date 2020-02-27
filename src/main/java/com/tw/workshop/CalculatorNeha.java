package com.tw.workshop;

public class CalculatorNeha {

   public int number1 ;
   public int number2 ;
   public static int result ;


    public int sum(int number1, int number2) {
        this.number1 =number1 ;
        this.number2= number2;
     return result = number1+number2  ;

    }

    public int subtract(int number1, int number2) {
        this.number1 =number1 ;
        this.number2= number2;
        return result = number1-number2  ;

    }

    public int division(int number1, int number2) {
        this.number1 =number1 ;
        this.number2= number2;
        return result = number1/number2  ;

    }

    public int multiplication(int number1, int number2) {
        this.number1 =number1 ;
        this.number2= number2;
        return result = number1*number2  ;

    }

    public static void main (String [] args) {
        CalculatorNeha calc = new CalculatorNeha();
         calc.sum(15,5);
        System.out.println ("Sum of the numbers is " +result );
        calc.subtract(12,4);
        System.out.println ("Subtraction of the numbers is " +result );
        calc.division(21,3);
        System.out.println ("Division of the numbers is " +result );
        calc.multiplication(6,3);
        System.out.println ("Multiplication of the numbers is " +result );

    }
}
