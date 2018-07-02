package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(2,2);
        //Then
        Assert.assertEquals(4, result, 0.001);
    }


}
