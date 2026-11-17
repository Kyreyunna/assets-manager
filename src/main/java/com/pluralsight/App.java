package com.pluralsight;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        House house1= new House("good", "2004-10-13", new BigDecimal(0.00));
//        BigDecimal value;
        System.out.println(house1);
    }
}
