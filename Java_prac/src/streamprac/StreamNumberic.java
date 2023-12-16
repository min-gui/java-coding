package streamprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamNumberic {

    public static void main(String[] args) {
        basic();
    }

    static void basic() {
        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(1, "user1", "MAN"),
                new UserDto(2, "user2", "MAN2")
        );

        /**
         * reduce 는 하나의 데이터로 만드는 작업을 수행합니다.
         */
        int idxSum = userDtoList.stream()
                .map(UserDto::getIdx)
                .reduce(0, Integer::sum);

        Optional<Integer> reduce = userDtoList.stream()
                .map(UserDto::getIdx)
                .reduce((x, y) -> x + y);


        int idxSum2 = userDtoList.stream()
                .mapToInt(UserDto::getIdx)
                .sum();


        System.out.println("idxSum = " + idxSum);
        System.out.println("reduce = " + reduce);
        System.out.println("idxSum2 = " + idxSum2);


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> list1 = list.stream().map(x -> x * 2).collect(Collectors.toList());

        list1
                .stream()
                .forEach(System.out::println);
    }
}
