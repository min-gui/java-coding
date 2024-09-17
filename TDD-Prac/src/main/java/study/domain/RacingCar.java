package study.domain;

import study.strategy.MoveStrategy;
import study.util.RandomCountGenerator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RacingCar {

    public static int DEFAULT_MOVE_NUM = 4;
    private int position;

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void go(MoveStrategy moveStrategy, int num) {
        int resultMoveNum = moveStrategy.moveDistance(num);
        position += resultMoveNum;
    }

    public int createRandomNum(){
        return RandomCountGenerator.generateRandomNum();
    }

    public static List<RacingCar> createRacingCars(int cnt){
        return Stream.generate(RacingCar::new)
                .limit(cnt)
                .collect(Collectors.toList());
    }


}
