package com.company;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CosTest extends CalculatorTest{

    @Test(groups = "Value from DataProvider",dataProvider = "cosDataProvider")
    @Parameters({"a", "expected"})
    public void mulTest(double a, double expected){
        double sum = round(calculator.cos(a));
        Assert.assertEquals(sum, expected);
    }

    @DataProvider(name ="cosDataProvider")
    public Object[][] cosDataProvider(){
        return new Object[][]{
                {3,0.1411},
                {5,-0.9589},
                {8,0.9894}};
    }

}
