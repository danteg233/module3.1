package com.company;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class AddAndSubCalTest extends CalculatorTest{

    @Test(dataProvider = "sumDataProvider")
    @Parameters({"a", "b", "expected"})
    public void sumTest(long a, long b, long expected){
        long sum = calculator.sum(a,b);
        Assert.assertEquals(sum, expected);
    }

    @Test(dataProvider = "subDataProvider")
    @Parameters({"a", "b", "expected"})
    public void subTest(long a, long b, long expected){
        long sub = calculator.sub(a,b);
        Assert.assertEquals(sub, expected);
    }


//    @DataProvider(name ="sumDataProvider")
//    public Object[][] sumDataProvider(){
//        return new Object[][]{
//                {1,1,2},
//                {2,2,4},
//                {0,1,1}};
//    }
//
//    @DataProvider(name ="subDataProvider")
//    public Object[][] subDataProvider(){
//        return new Object[][]{
//                {1,1,0},
//                {13,3,10},
//                {0,1,-1}};
//    }
}
