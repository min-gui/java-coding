package racing.strategy;

public class AlwaysMoveStrategy implements MoveStrategy{
    @Override
    public int moveDistance(int num) {
        return num;
    }
}
