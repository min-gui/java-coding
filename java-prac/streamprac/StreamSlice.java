package streamprac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSlice {
    public static void main(String[] args) {
        userFilter();
        useTakeWhile();
        useDropWhile();
        useLimit();
        useSkip();
    }

    static void userFilter() {
        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(1, "name1", "man"),
                new UserDto(0, "name0", "woman"),
                new UserDto(2, "name2", "man"),
                new UserDto(5, "name5", "woman"),
                new UserDto(4, "name4", "woman"),
                new UserDto(9, "name9", "woman"),
                new UserDto(10, "name10", "man")
        );

        List<UserDto> list = userDtoList.stream()
                .filter(dto-> dto.getIdx()>0)
                .collect(Collectors.toList());

        System.out.println(list);
    }

    static void useTakeWhile() {
        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(1, "name1", "man"),
                new UserDto(0, "name0", "woman"),
                new UserDto(2, "name2", "man"),
                new UserDto(5, "name5", "woman"),
                new UserDto(4, "name4", "woman"),
                new UserDto(9, "name9", "woman"),
                new UserDto(10, "name10", "man")
        );
        //take while 은 조건이 거짓일 경우에 멈춘다.
        List<UserDto> list = userDtoList.stream()
                .takeWhile(userDto -> userDto.getIdx() < 5 )
                .collect(Collectors.toList());

        System.out.println("---");
        list.stream().forEach(System.out::println);

    }

    static void useDropWhile(){

        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(1, "name1", "man"),
                new UserDto(0, "name0", "woman"),
                new UserDto(2, "name2", "man"),
                new UserDto(5, "name5", "woman"),
                new UserDto(4, "name4", "woman"),
                new UserDto(9, "name9", "woman"),
                new UserDto(10, "name10", "man")
        );

        //takeWhile 과 반대, 조건이 거짓일때 지금 까지 탐색 했던거 이외것을 리스트로 담는다.
        List<UserDto> list = userDtoList.stream()
                .dropWhile(userDto -> userDto.getIdx() < 2)
                .collect(Collectors.toList());

        System.out.println("---");
        list.stream().forEach(System.out::println);

    }

    static void useLimit() {
        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(1, "name1", "man"),
                new UserDto(0, "name0", "woman"),
                new UserDto(2, "name2", "man"),
                new UserDto(5, "name5", "woman"),
                new UserDto(4, "name4", "woman"),
                new UserDto(9, "name9", "woman"),
                new UserDto(10, "name10", "man")
        );

        List<UserDto> list = userDtoList.stream()
                .filter(userDto -> userDto.getIdx() < 10)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println("---");
        list.stream().forEach(System.out::println);
    }

    static void useSkip() {
        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(1, "name1", "man"),
                new UserDto(0, "name0", "woman"),
                new UserDto(2, "name2", "man"),
                new UserDto(5, "name5", "woman"),
                new UserDto(4, "name4", "woman"),
                new UserDto(9, "name9", "woman"),
                new UserDto(10, "name10", "man")
        );

        List<UserDto> list = userDtoList.stream()
                .filter(userDto -> userDto.getIdx() < 1)
                .skip(2)
                .collect(Collectors.toList());

        System.out.println("---");
        list.stream().forEach(System.out::println);
    }

}
