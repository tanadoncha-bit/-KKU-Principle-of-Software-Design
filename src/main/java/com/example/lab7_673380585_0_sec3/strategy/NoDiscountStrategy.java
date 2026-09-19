package com.example.lab7_673380585_0_sec3.strategy;

public class NoDiscountStrategy implements DiscountStrategy {

    @Override
    public double calculatePrice(double price) {
        return price;
    }

}