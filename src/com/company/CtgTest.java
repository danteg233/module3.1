package com.company;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CtgTest extends CalculatorTest{

    @Test(groups = "Value from DataProvider", dataProvider = "ctgDataProvider")
    @Parameters({"a", "b", "expected"})
    public void mulTest(double a, double expected){
        double sum = calculator.ctg(a);
        Assert.assertEquals(sum, expected);
    }

    @DataProvider(name ="ctgDataProvider")
    public Object[][] ctgDataProvider(){
        return new Object[][]{
                {3,0.995},
                {2,1},
                {5,1}};
    }
}
