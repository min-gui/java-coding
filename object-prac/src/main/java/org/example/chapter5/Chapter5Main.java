package org.example.chapter5;


import org.example.chapter5.custom.*;
import org.example.chapter5.step03.PeriodCondition;

import java.util.ArrayList;
import java.util.List;

public class Chapter5Main {

    // NOTE : step3 실행
    public static void main(String[] args) {

        List<CustomDiscountCondition> discountConditions = new ArrayList<>();

        discountConditions.add(new CustomSequenceCondition());
        discountConditions.add(new CustomePeriodCondition());

        // NOTE : discountConditions를 List로 만들어서 할인 조건을 여러 개 추가할 수 있도록 변경
        CustomMovie customMovie = new CustomMovie();
        customMovie.setDiscountConditions(discountConditions);

        //다형성 패턴 확장, 유지보수 쉽지만 클래스 코드파악 비용이 늘어남.
        CustomScreening customScreening = new CustomScreening();
        customScreening.setCustomMovie(customMovie);
        customScreening.setSequence(2);
        customScreening.setDay(1);
        customScreening.calculateFee(1);





    }
}
