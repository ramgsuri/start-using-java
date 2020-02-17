package com.tw.workshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MyFirstApplicationTest {

    @Test
    public void checkThatJavaMavenAndJUnitAreInstalled(){

        Assertions.assertTrue(true, "this test should pass if Java, JUnit and Maven are installed");
    }
}