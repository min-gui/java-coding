package racing.domain;

import racing.strategy.MoveStrategy;
import racing.util.RandomCountGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCar {

    public static int DEFAULT_MOVE_NUM = 4;
    public static int DEFAULT_POSITION = 0;
    private int position;
    private String carName;

    public RacingCar(int position, String carName) {
        this.position = position;
        this.carName = carName;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public String getCarName() {return carName;}

    public void go(MoveStrategy moveStrategy, int num) {
        int resultMoveNum = moveStrategy.moveDistance(num);
        position += resultMoveNum;
    }

    public int createRandomNum(){
        return RandomCountGenerator.generateRandomNum();
    }

    public static List<RacingCar> createRacingCars(String[] carNames) {
        return Arrays.stream(carNames)
                .map(carName -> new RacingCar(DEFAULT_POSITION, carName))
                .collect(Collectors.toList());

    }


}
