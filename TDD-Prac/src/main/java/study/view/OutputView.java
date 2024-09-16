package study.view;

import study.domain.RacingCar;

import java.util.Arrays;
import java.util.List;

public class OutputView {

    private static final String POSITION_ICON = " | ";

    public static void carsStatus(List<RacingCar> racingCars){
        for (RacingCar racingCar : racingCars){
            System.out.println(racingCar.getPosition());
        }
    }

    public static void printPosition(int position){
        for (int i = 0 ; i < position ; i++){
            System.out.println(POSITION_ICON);
        }
        System.out.println();
    }

}
