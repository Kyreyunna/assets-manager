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
//        BigDecimal price= BigDecimal.valueOf((squareFoot*condition)+(0.25*lotSize));
        //will I need a switch so that I can make it so condition 1 "excellent"
        // will correspond to the dollar value(180)?
        //should condition be an int or string like "good"?

//  AI suggests: Set a single rate variable in the switch, compute math once at the end
                switch (condition){
            case 1: {
                condition = 180;
                System.out.println("excellent");
            } break;
            case 2: {
               condition = 130;
                System.out.println("good");
            } break;
            case 3: {
                condition = 90;
                System.out.println("fair");
            } break;
            case 4: {
               condition = 80;
                System.out.println("poor");
            } break;
            default:{
                System.out.println("invalid condition");
            }

        }BigDecimal price =BigDecimal.valueOf((squareFoot*condition)+(0.25*lotSize));

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
