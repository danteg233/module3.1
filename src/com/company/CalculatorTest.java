package com.company;

import com.epam.tat.module4.Calculator;
import org.junit.BeforeClass;

public class CalculatorTest {
    protected Calculator calculator;

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    protected double round(double value){
        return (double)Math.round(value*10000d)/10000d;
    }

    protected double stringToDouble(String string){
        return Double.parseDouble(string);
    }

    protected float stringToFloat(String string){
        return Float.parseFloat(string);
    }
}
