package com.example.lab7_673380585_0_sec3.strategy;

public class DiscountContext {

    public double calculate(double price, String discountType){

        DiscountStrategy strategy;

        switch(discountType){

            case "STUDENT":
                strategy = new StudentDiscountStrategy();
                break;

            case "SEASONAL":
                strategy = new SeasonalSaleStrategy();
                break;

            default:
                strategy = new NoDiscountStrategy();

        }

        return strategy.calculatePrice(price);

    }

}