package com.tw.workshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NandiniCalculatorTest {

    private int number1;
    private int number2;

@BeforeEach
public void init(){
     number1=10;
     number2=20;
}

    @Test
    public void shouldReturnAnswerIfAllInputZero() {
        //int number1 = 0;
        //int number2 = 0;

        NandiniCalculator ob = new NandiniCalculator(number1, number2);
        int sum = ob.calAdd();
        Assertions.assertTrue( sum== 0, "Result is notCorrect");


    }

    @Test
    public void shouldReturnAnswerIfSumIsCorrect() {
        //int number1 = 0;
        //int number2 = 0;

        NandiniCalculator ob = new NandiniCalculator(number1, number2);
        int sum = ob.calAdd();
        Assertions.assertTrue(sum == 30, "Result is notCorrect");


    }

    }

