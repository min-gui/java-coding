package streamprac;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UseIntStream {
    public static void main(String[] args) {
        intStream();
    }

    static void intStream(){
        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(3, "Hello", "man"),
                new UserDto(0, "World", "woman"),
                new UserDto(2, "name2", "man")
        );

        IntStream intStream = userDtoList.stream()
                .mapToInt(UserDto::getIdx);

        Stream<Integer> integerStream = intStream.boxed();

        integerStream.forEach(System.out::println);

        //0이라는 기본값이 나온다면, 0인 경우를 구분하기위해 OptionalInt 스트림을 사용하자.

        OptionalInt maxIdx = userDtoList.stream()
                .mapToInt(UserDto::getIdx)
                .max();

        //실제 최대값이 0일 경우와 아예 값이 없을경우 구분 하기 위해서.
        System.out.println("maxIdx = " + maxIdx);

        int orElseMaxIdx = maxIdx.orElse(1);
    }
}
