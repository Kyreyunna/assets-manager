package com.pluralsight;

import java.math.BigDecimal;

public class House extends Asset{

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
    }
    //we want  to override asset  to get the value of a specific house
    @Override
    public BigDecimal getValue() {
        BigDecimal price= BigDecimal.valueOf((squareFoot*condition)+(0.25*lotSize));
        //will I need a switch so that I can make it so condition 1 "excellent"
        switch (condition){
            case 1: {
                price = new BigDecimal(180.00);
                System.out.println("excellent");
            }
            case 2: {
                price = new BigDecimal(130.00);
                System.out.println("good");
            }
        }
        // will correspond to the dollar value(180)?
        //should I do this logic in asset's getValue()?no bc then it would apply to every subclass
//        setOriginalCost((squareFoot*condition)+(0.25*lotSize));
//    setOriginalCost();

        return price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
