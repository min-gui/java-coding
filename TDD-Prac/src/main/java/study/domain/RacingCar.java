package study.domain;

import study.strategy.MoveStrategy;
import study.util.RandomCountGenerator;

public class RacingCar {

    public static int DEFAULT_MOVE_NUM = 4;
    private int position;

    public RacingCar(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void go(MoveStrategy moveStrategy, int num) {
        int resultMoveNum = moveStrategy.moveNum(num);
        position += resultMoveNum;
    }

    public int createRandomNum(){
        return RandomCountGenerator.generateRandomNum();
    }


}
