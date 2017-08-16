package com.company.arithmetic;

import com.company.CalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class AddTest extends CalculatorTest {
    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    @Parameters({"a", "b", "expected"})
    public void sumTest(long a, long b, long expected){
        long sum = calculator.sum(a,b);
        Assert.assertEquals(sum, expected);
    }

}
