package streamprac;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIteration {

    public static void main(String[] args) {
        interOuterForEach();
    }

    static void interOuterForEach(){
        //내부 반복
        List<String> names = new ArrayList<>();
        List<UserDto> userDtoList = new ArrayList<>();
        userDtoList.add(new UserDto(1, "name1", "man"));
        userDtoList.add(new UserDto(0, "name0", "woman"));
        userDtoList.add(new UserDto(2, "name2", "man"));
        userDtoList.add(new UserDto(5, "name5", "woman"));
        userDtoList.add(new UserDto(4, "name4", "woman"));
        userDtoList.add(new UserDto(9, "name9", "woman"));
        userDtoList.add(new UserDto(10, "name10", "man"));

        for (UserDto userDto : userDtoList) {
            names.add(userDto.getName());
        }

        List<String> streamNames = userDtoList.stream()
                .map(UserDto::getName)
                .collect(Collectors.toList());

        for (String streamName : streamNames) {
            System.out.println(streamName);
        }

    }
}
