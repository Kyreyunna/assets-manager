package com.pluralsight;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        House house1= new House("good", "2004",new BigDecimal(1) , "123 Drive",2, 1800,6000);
//        House getValue;
        System.out.println(house1.getValue());
    }
}
