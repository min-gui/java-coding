package org.example.chapter5.custom;

public class CustomePeriodCondition implements CustomDiscountCondition {
    @Override
    public boolean isSatisfiedBy(CustomScreening customScreening) {
        if (customScreening.getDay() <= 1) {
            System.out.println("Period 할인 가능");
            return true;
        }
        System.out.println("Period 할인 불가능");
        return false;


    }
}
