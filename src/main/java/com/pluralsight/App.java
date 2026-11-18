package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        House house1= new House("cabin", "2004",new BigDecimal(1) , "123 Drive",2, 1800,6000);
//        House getValue;
        System.out.println(house1.getValue());

        House house2 = new House("beach house", "2002", new BigDecimal("2000.00"), "123 Drive", 2, 2000, 6000);

        Vehicle vehicle1 = new Vehicle("Volkswagen New Beetle", "2004", new BigDecimal("2000.00"));
        Vehicle vehicle2 = new Vehicle("Craig's truck", "2001", new BigDecimal("2000.00"));

        assets.add(house2);
        assets.add(house1);
        assets.add(vehicle1);
        assets.add(vehicle2);

//      Loop through the list and print each asset's description, date acquired, what you paid, and its value
        for (Asset asset : assets) {
            System.out.println(asset.getDescription() +asset.getDateAcquired()+asset.getOriginalCost()+ " $" + asset.getValue());

        }

    }
}
