package com.company.trigonometry;

import com.company.CalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CtgTest extends CalculatorTest {

    @BeforeClass(groups = "CtgTest")
    public void setUp(){
        calculator = new Calculator();
    }

    @Test(groups = "CtgTest", dataProvider = "ctgDataProvider")
    @Parameters({"a", "b", "expected"})
    public void mulTest(double a, double expected){
        double sum = round(calculator.ctg(a));
        Assert.assertEquals(sum, expected);
    }

    @DataProvider(name ="ctgDataProvider")
    public Object[][] ctgDataProvider(){
        return new Object[][]{
                {3,0.9951},
                {2,0.964},
                {5,0.9999}};
    }
}
