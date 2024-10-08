package lotto.util;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RottoNumberUtil {

    private final static int LOTTO_NUMBER_MAX = 45;
    private final static int LOTTO_NUMBER_MIN = 1;

    private final static int LOTTO_START_NUM = 0;

    public static List<Integer> generateLottoNumber(int lottoNum){
        List<Integer> list = IntStream.rangeClosed(LOTTO_NUMBER_MIN, LOTTO_NUMBER_MAX)
                .boxed()
                .collect(Collectors.toList());

        Collections.shuffle(list);
        return list.subList(LOTTO_START_NUM, lottoNum);

    }
}
