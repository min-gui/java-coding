package racing.view;

import racing.domain.RacingCar;

import java.util.List;

public class OutputView {

    private static final String POSITION_ICON = " | ";

    private OutputView() {}

    public static void carsStatus(List<RacingCar> racingCars, int roundNum){
        System.out.println("-- "+roundNum+" --");
        for (RacingCar racingCar : racingCars){
            printName(racingCar.getCarName());
            printPosition(racingCar.getPosition());
        }
    }

    public static void printPosition(int position){
        for (int i = 0 ; i < position ; i++){
            System.out.print(POSITION_ICON);
        }
        System.out.println();
    }

    public static void printName(String carName){
        System.out.print(carName + " : ");
    }

}
