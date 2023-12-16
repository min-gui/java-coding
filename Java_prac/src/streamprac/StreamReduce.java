package streamprac;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static void main(String[] args) {
        useReduce();
    }

    /**
     * reduce 연산
     */

    static void useReduce(){
        /* before */
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        int sum = 0;

        for (int x : numbers) {
            sum += x;
        }

        //초기값 설정 : 0
        int sum2 = numbers.stream()
                .reduce(0, Integer::sum);


        System.out.println("sum2 = " + sum2);

        Optional<Integer> reduce = numbers.stream()
                .reduce(Integer::sum);

        System.out.println(reduce.get());

        int getMax = numbers.stream().reduce(0, Integer::max);
        int getMin = numbers.stream().reduce(0, Integer::min);

        System.out.println("getMin = " + getMin);
        System.out.println("getMax = " + getMax);
    }
}
