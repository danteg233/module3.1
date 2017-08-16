package com.company.tests.another;

import com.company.tests.CalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PowTest extends CalculatorTest {
    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    @Test(dataProvider = "powDataProvider")
    @Parameters({"a", "b", "expected"})
    public void powTest(double a, double b, double expected){
        double sub = calculator.pow(a,b);
        Assert.assertEquals(sub, expected);
    }


    @DataProvider(name ="powDataProvider")
    public Object[][] powDataProvider(){
        return new Object[][]{
                {1,1,1},
                {2,5,32},
                {0,1,0}};
    }


}
