package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //Abstract

        //asset is abstract; cannot be instantiated: so you can't create a new asset bc it isn't a specific instance of the asset. The asset is the parent you can only have a new subclass of the parent not a new parent. The asset is abstract because abstract means you can't create it

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
            if (asset instanceof House){
                System.out.println(house1.getAddress());
                System.out.println(house2.getAddress());
            }
            if (asset instanceof Vehicle){
                System.out.println(vehicle1.getMakeModel());
                System.out.println(vehicle2.getMakeModel());
            }
            System.out.println(asset.getDescription() +asset.getDateAcquired()+asset.getOriginalCost()+ " $" + asset.getValue());
//          //or Replace 'house' with pattern variable
        }

    }
}
