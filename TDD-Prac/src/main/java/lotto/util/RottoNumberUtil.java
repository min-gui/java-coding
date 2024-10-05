package lotto.util;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RottoNumberUtil {

    private final static int LOTTO_NUMBER_SIZE = 6;
    private final static int LOTTO_NUMBER_MAX = 45;
    private final static int LOTTO_NUMBER_MIN = 1;

    public static List<Integer> generateLottoNumber(){
        List<Integer> list = IntStream.rangeClosed(LOTTO_NUMBER_MIN, LOTTO_NUMBER_MAX)
                .boxed()
                .collect(Collectors.toList());

        Collections.shuffle(list);
        return list.subList(0, LOTTO_NUMBER_SIZE);

    }
}
