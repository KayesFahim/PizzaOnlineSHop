package com.example.onlinepizza;

public class DiscountClass {
    int Id;
    public int OrderAmount;
    public Boolean DiscountEligibility;

    public DiscountClass() {
    }

    public DiscountClass(int id, int orderAmount, Boolean discountEligibility) {
        Id = id;
        OrderAmount = orderAmount;
        DiscountEligibility = discountEligibility;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getOrderAmount() {
        return OrderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        OrderAmount = orderAmount;
    }

    public Boolean getDiscountEligibility() {
        return DiscountEligibility;
    }

    public void setDiscountEligibility(Boolean discountEligibility) {
        DiscountEligibility = discountEligibility;
    }

    public void GetDiscount(){

    }
}
