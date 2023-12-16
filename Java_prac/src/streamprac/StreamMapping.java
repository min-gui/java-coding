package streamprac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapping {
    public static void main(String[] args) {
        map();
    }

    static void map() {
        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(1, "user1", "MAN"),
                new UserDto(2, "user2", "MAN2")
        );

        //함수를 적용한 결과가 새로운 요소로 매핑된다.
        //map은 새로운버전을 만든다라는 개념이다.
        List<Integer> list = userDtoList
                .stream()
                .map(UserDto::getIdx)
                .collect(Collectors.toList());

        for (Integer integer : list) {
            System.out.println("integer = " + integer);
        }

        List<Long> longs = userDtoList.stream()
                .map(UserDto::getIdx)
                .map(Integer::longValue)
                .collect(Collectors.toList());

        for (long item : longs) {
            System.out.println("longs = " + item);
        }
    }
}
