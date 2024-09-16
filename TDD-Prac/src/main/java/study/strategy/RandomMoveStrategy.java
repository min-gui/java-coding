package study.strategy;

import study.domain.RacingCar;

import java.util.Random;

public class RandomMoveStrategy implements MoveStrategy {
    private static final Random random = new Random();

    @Override
    public int moveDistance(int num) {
        return random.nextInt(10) >= RacingCar.DEFAULT_MOVE_NUM ? num : 0;
    }
}
