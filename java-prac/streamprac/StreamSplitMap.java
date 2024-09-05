package streamprac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSplitMap {

    public static void main(String[] args) {
        splitMap();
        userFlatmap();
    }

    static void splitMap() {
        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(1, "name1", "man"),
                new UserDto(0, "name1", "woman"),
                new UserDto(2, "name2", "man"),
                new UserDto(5, "name5", "woman"),
                new UserDto(4, "name4", "woman"),
                new UserDto(9, "name9", "woman"),
                new UserDto(10, "name10", "man")
        );

        List<String[]> list = userDtoList.stream()
                .map(dto ->dto.getName().split(" "))
                .distinct()
                .collect(Collectors.toList());

        list.stream().forEach(dto-> System.out.println(dto[0]));


        String[] arrayOfWords = {"Goodbye", "World"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);

        List<Stream<String>> list2 = userDtoList.stream()
                .map(dto -> dto.getName().split(" "))
                .map(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        list2.stream().forEach(a -> a.forEach(System.out::println));

    }

    static void userFlatmap(){
        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(1, "Hello", "man"),
                new UserDto(0, "World", "woman"),
                new UserDto(2, "name2", "man")
        );

        List<String[]> collect = userDtoList.stream()
                .map(s -> s.getName().split(" "))
                .collect(Collectors.toList());

        collect.stream().forEach(s -> System.out.println("s = " +s[0] ));

        List<String> list3 = userDtoList.stream()
                .map(dto -> dto.getName().split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        list3.stream().forEach(System.out::print);
    }
}
