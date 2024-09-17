package racing.view;

import racing.domain.RacingCar;

import java.util.List;

public class OutputView {

    private static final String POSITION_ICON = " | ";

    public static void carsStatus(List<RacingCar> racingCars, int roundNum){
        System.out.println("-- "+roundNum+" --");
        for (RacingCar racingCar : racingCars){
            printPosition(racingCar.getPosition());
        }
    }

    public static void printPosition(int position){
        for (int i = 0 ; i < position ; i++){
            System.out.print(POSITION_ICON);
        }
        System.out.println();
    }

}
