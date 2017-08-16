package com.company.tests.arithmetic;

import com.company.tests.CalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubTest extends CalculatorTest {

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    @Test(dataProvider = "subDataProvider")
    public void subTest(long a, long b, long expected){
        long sub = calculator.sub(a,b);
        Assert.assertEquals(sub, expected);
    }

    @Test(dataProvider = "subDataProviderStr")
    @Parameters({"a", "b", "expected"})
    public void subTestString(String a, String b, long expected){
        long sub = (long) calculator.sub((Double.parseDouble(a)),(Double.parseDouble(b)));
        Assert.assertEquals(sub, expected);
    }

    @DataProvider(name ="subDataProvider")
    public Object[][] subDataProvider(){
        return new Object[][]{
                {1,1,0},
                {13,3,10},
                {0,1,-1}};
    }

    @DataProvider(name ="subDataProviderStr")
    public Object[][] subDataProviderStr(){
        return new Object[][]{
                {"1","1",0},
                {"13","3",10},
                {"0","1",-1}};
    }
}
