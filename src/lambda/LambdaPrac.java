package lambda;

import java.util.function.IntBinaryOperator;

public class LambdaPrac {

    public static void main(String[] args) {
        IntBinaryOperator operator;

        //정적 메소드 참조
        operator = LambdaPrac::max;
        System.out.println(operator.applyAsInt(3,5));

        //람다식 함수형 인터페이스 정의
        MySum func = (a, b) -> a+b;

        System.out.println(func.sum(5,6));
    }

    static int max(int a, int b){
        return a > b ? a : b;
    }


}
