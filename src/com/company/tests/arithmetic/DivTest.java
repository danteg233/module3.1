package com.company.arithmetic;

import com.company.CalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DivTest extends CalculatorTest {
    private long a, b, expected;

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    @Factory(dataProvider = "divDataProvider")
    public DivTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void divTest(){
        long sum = calculator.div(a,b);
        Assert.assertEquals(sum, expected);
    }

    @DataProvider(name = "divDataProvider")
    public static Object[][] divDataProvider(){
        return new Object[][]{
                {25,5,5},
                {8,2,4},
                {0,1,0}};
    }

}
