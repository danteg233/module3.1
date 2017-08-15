package com.company;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MulAndDivTest {
    private Calculator calculator;

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    @Test(dataProvider = "mulDataProvider")
    @Parameters({"a", "b", "expected"})
    public void mulTest(long a, long b, long expected){
        long sum = calculator.mult(a,b);
        Assert.assertEquals(sum, expected);
    }

    @Test(dataProvider = "divDataProvider", expectedExceptions = NumberFormatException.class)
    @Parameters({"a", "b", "expected"})
    public void divTest(long a, long b, long expected){
        long sub = calculator.div(a,b);
        Assert.assertEquals(sub, expected);
    }


    @DataProvider(name ="mulDataProvider")
    public Object[][] mulDataProvider(){
        return new Object[][]{
                {1,1,1},
                {2,2,4},
                {0,1,0}};
    }

    @DataProvider(name ="divDataProvider")
    public Object[][] divDataProvider(){
        return new Object[][]{
                {13,0,0}
                };
    }
}
