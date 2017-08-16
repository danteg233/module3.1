package com.company.arithmetic;

import com.company.CalculatorTest;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class MulTest extends CalculatorTest {

    private long a, b, expected;

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    @Factory(dataProvider = "mulDataProvider")
    public MulTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }


    @Test
    public void mulTest(){
        long sum = calculator.mult(a,b);
        Assert.assertEquals(sum, expected);
    }


    @DataProvider(name ="mulDataProvider")
    public static Object[][] mulDataProvider(){
        return new Object[][]{
                {1,1,1},
                {2,2,4},
                {0,1,0}};
    }

}
