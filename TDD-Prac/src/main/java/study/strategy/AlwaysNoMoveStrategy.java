package study.strategy;

public class AlwaysNoMoveStrategy implements MoveStrategy {
    @Override
    public int moveNum(int num) {
        return 0;
    }
}
