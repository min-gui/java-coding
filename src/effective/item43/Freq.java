package effective.item43;

import java.util.Map;
import java.util.TreeMap;

// map.merge를 이용해 구현한 빈도표 - 람다 방식과 메서드 참조 방식을 비교해보자
// 대부분 매서드 참조가 깔끔해 보이지만 예외도 있으니 참조하길 바람.
public class Freq {
    public static void main(String[] args) {

        Map<String, Integer> frequencyTable = new TreeMap<>();
        String[] strings = {"min55", "ok", "ok", "yes666"};


        for (String s : strings)
            //빈도수 측정
            frequencyTable.merge(s, 1,
                    (count, incr) -> count + incr);

        System.out.println(frequencyTable);

        for (String s : strings) {
            frequencyTable.merge(s,1,Integer::sum);
        }

    }
}
