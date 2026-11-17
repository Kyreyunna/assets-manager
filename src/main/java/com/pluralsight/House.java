package com.pluralsight;

import java.math.BigDecimal;

public class House extends Asset{

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

//    public House(String description, String dateAcquired, BigDecimal originalCost) {
//        super(description, dateAcquired, originalCost);
//    }

    public House(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    //we want  to override asset  to get the value of a specific house
    @Override
    public BigDecimal getValue() {
        BigDecimal price= BigDecimal.valueOf((squareFoot*condition)+(0.25*lotSize));
        //will I need a switch so that I can make it so condition 1 "excellent"
        // will correspond to the dollar value(180)?
        //should condition be an int or string like "good"?
        switch (condition){
            case 1: {
                price =BigDecimal.valueOf((squareFoot*180)+(0.25*lotSize));
                System.out.println("excellent");
            } break;
            case 2: {
                price = BigDecimal.valueOf((squareFoot*130)+(0.25*lotSize));
                System.out.println("good");
            } break;
            case 3: {
                price = new BigDecimal(90.00);
                System.out.println("fair");
            } break;
            case 4: {
                price = new BigDecimal(80.00);
                System.out.println("poor");
            } break;
            default:{
                System.out.println("invalid condition");
            }

        }

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

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", condition=" + condition +
                ", squareFoot=" + squareFoot +
                ", lotSize=" + lotSize +
                '}';
    }
}
