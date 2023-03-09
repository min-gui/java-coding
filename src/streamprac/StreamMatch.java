package streamprac;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMatch {

    public static void main(String[] args) {
        anyMatch();
        allMatch();
        noneMatch();
        useFindFirst();
    }

    static void anyMatch() {

        /*내부반복*/
        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(1, "user1", "MAN"),
                new UserDto(2, "user2", "MAN2")
        );

        boolean isChecked = userDtoList.stream()
                .anyMatch(userDto -> userDto.getIdx() > 1);

        System.out.println(isChecked);


    }

    /**
     * allMatch
     */
    static void allMatch() {
        /* 내부반복 */
        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(1, "user1", "MAN"),
                new UserDto(2, "user2", "MAN2")
        );

        /**
         * 모든 요소가 주어진 프레디케이트와 일치하는지 확인
         */
        boolean isChekced = userDtoList.stream()
                .allMatch(dto -> dto.getIdx() > 1);

        System.out.println("isChekced = " + isChekced);
    }

    static void noneMatch() {
        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(1, "user1", "MAN"),
                new UserDto(2, "user2", "MAN2")
        );

        /**
         * 모든 요소가 프레디케이트와 일치하지않는지 확인
         */
        boolean isChekced = userDtoList.stream()
                .noneMatch(dto -> dto.getIdx() > 1);

        System.out.println("isChekced = " + isChekced);
    }


    static void useFindFirst() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        /**
         * 첫번째 값을 반환한다
         */
        Optional<Integer> first = numbers.stream()
                .map(n -> n * n)
                .filter(n -> n % 3 == 0)
                .findFirst();

        System.out.println(first);
    }

}
