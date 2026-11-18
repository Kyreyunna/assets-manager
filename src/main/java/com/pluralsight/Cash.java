package com.pluralsight;

import java.math.BigDecimal;

public class Cash extends Asset{
    public Cash(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
    }
    @Override
    //I am keeping Override to check for any typos, but I don't think it's needed since cash doesn't need to override the value of the original cost? But it is needed just in case there is a typo in getValue or other errors
    //Once a method is marked abstract in a parent class(getValue()), Java forces every concrete (non-abstract) child class(Vehicle,cash, house) to implement/override that method—even if the implementation is just returning getOriginalCost()
    //Keeping the @Override annotation right above public BigDecimal getValue() tells the compiler to verify that your method signature matches the abstract method in Asset
    public BigDecimal getValue() {
        return getOriginalCost();
    }
}
