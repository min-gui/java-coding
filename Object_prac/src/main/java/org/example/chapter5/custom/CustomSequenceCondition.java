package org.example.chapter5.custom;

public class CustomSequenceCondition implements CustomDiscountCondition{
    @Override
    public boolean isSatisfiedBy(CustomScreening customScreening) {
        if (customScreening.getSequence() >= 2){
            System.out.println("Sequence 할인 가능");
            return true;
        }
        System.out.println("Sequence 할인 불가능");
        return false;
    }
}
