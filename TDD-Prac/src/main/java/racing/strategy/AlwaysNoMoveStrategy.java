package racing.strategy;

public class AlwaysNoMoveStrategy implements MoveStrategy {
    @Override
    public int moveDistance(int num) {
        return 0;
    }
}
