package com.company.another;

import com.company.CalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SqrtTest extends CalculatorTest {
    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    @Test(dataProvider = "sqrtDataProvider")
    @Parameters({"a", "expected"})
    public void mulTest(double a, double expected){
        double sum = round(calculator.sqrt(a));
        Assert.assertEquals(sum, expected);
    }

    @DataProvider(name ="sqrtDataProvider")
    public Object[][] sqrtDataProvider(){
        return new Object[][]{
                {1,1.0},
                {2,1.4142},
                {4,2.0}};
    }
}
