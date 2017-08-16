package com.company.tests.trigonometry;

import com.company.tests.CalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SinTest extends CalculatorTest {

    @BeforeClass(groups = "SinTest")
    public void setUp(){
        calculator = new Calculator();
    }

    @Test(groups = "SinTest", dependsOnMethods = "sin30")
    public void sin0(){
        System.out.println("Sin0");
        Assert.assertEquals(calculator.sin(0), 0.0);
    }

    @Test(groups = "SinTest", dependsOnMethods = "sin45")
    public void sin30(){
        System.out.println("Sin30");
        Assert.assertEquals(round(calculator.sin((Math.PI/6))), 0.5);
    }

    @Test(groups = "SinTest", dependsOnGroups = "TgTest")
    public void sin45(){
        System.out.println("Sin45");
        Assert.assertEquals(round(calculator.sin((Math.PI/4))), 0.7071);
    }


}
