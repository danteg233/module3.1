package com.company.another;

import com.company.CalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IsNegativeTest extends CalculatorTest {
    @BeforeClass(groups = "PosNegTest")
    public void setUp(){
        calculator = new Calculator();
    }

    @Test(groups = "PosNegTest", dataProvider = "powDataProvider")
    @Parameters({"a", "b", "expected"})
    public void negTest(long a, boolean expected){
        boolean sub = calculator.isNegative(a);
        Assert.assertEquals(sub, expected);
    }


    @DataProvider(name ="powDataProvider")
    public Object[][] powDataProvider(){
        return new Object[][]{
                {1,false},
                {0,false}};
    }
}
