package com.example.demo.strategy;

public class DiscountContext {
    private DiscountStrategy strategy;

    public Double calDiscount(Double Price, String DiscountType) {
        switch (DiscountType) {
            case "MEMBER":
                strategy = new MemberDiscountStrategy();
                break;
            case "SEASONAL":
                strategy = new SeasonalSaleStrategy();
                break;
            default:
                strategy = new NoDiscountStrategy();
                break;
        }
        return strategy.calculatePrice(Price);
    }
}
