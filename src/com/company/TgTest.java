package com.company;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TgTest {
    private Calculator calculator;

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    @Test(groups = "Value from DataProvider", dataProvider = "tgDataProvider")
    @Parameters({"a", "b", "expected"})
    public void mulTest(double a, double expected){
        double sum = calculator.tg(a);
        Assert.assertEquals(sum, expected);
    }

    @DataProvider(name ="tgDataProvider")
    public Object[][] tgDataProvider(){
        return new Object[][]{
                {1,1},
                {2,1},
                {5,1}};
    }
}
