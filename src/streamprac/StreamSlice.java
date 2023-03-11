package streamprac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSlice {
    public static void main(String[] args) {
        userFilter();
        useTakeWile();
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

    static void useTakeWile() {
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

        System.out.println(list);
    }
}
