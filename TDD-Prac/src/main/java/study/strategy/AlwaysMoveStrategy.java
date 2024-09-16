package study.strategy;

public class AlwaysMoveStrategy implements MoveStrategy{
    @Override
    public int moveNum(int num) {
        return num;
    }
}
