package lambda;


//굳이 없어도 되는데, 함수형 인터페이스를 검증해준다.
@FunctionalInterface
public interface MySum {
    public int sum(int a, int b);
}
