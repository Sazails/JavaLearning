package com.tests;

public class AbstractUser extends AbstractTest{
    @Override
    public double addNumbers(double[] numbers) {
        double total = 0;
        for(double number : numbers){
            total += number;
        }
        return total;
    }

}
