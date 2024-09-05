package org.example.chapter5.custom;

import java.util.List;

public class CustomMovie {

    private String title;

    private List<CustomDiscountCondition> discountConditions;

    private boolean isDiscountable(CustomScreening screening) {
        return discountConditions.stream()
                .anyMatch(condition -> condition.isSatisfiedBy(screening));
    }

    public void setDiscountConditions(List<CustomDiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public void calculateMovieFee(CustomScreening screening) {
        if (isDiscountable(screening)) {
            System.out.println("calculateMovieFee 할인 가능");
        } else {
            System.out.println("calculateMovieFee 할인 불가능");
        }
    }
}
