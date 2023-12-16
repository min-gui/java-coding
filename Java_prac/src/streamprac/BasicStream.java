package streamprac;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStream {
    public static void main(String[] args) {
//        javaBasicCode();
//        java8Code();
        impossibleNewStream();
    }


    static void javaBasicCode() {
        List<UserDto> users = new ArrayList<>();
        List<UserDto> sampleDtoList = new ArrayList<>();

        sampleDtoList.add(new UserDto(1, "name2", "man"));
        sampleDtoList.add(new UserDto(0, "name0", "woman"));
        sampleDtoList.add(new UserDto(2, "name2", "man"));
        sampleDtoList.add(new UserDto(5, "name5", "woman"));
        sampleDtoList.add(new UserDto(4, "name4", "woman"));
        sampleDtoList.add(new UserDto(9, "name9", "woman"));
        sampleDtoList.add(new UserDto(10, "name10", "man"));

        for (UserDto userDto : sampleDtoList) {
            if (userDto.getIdx() < 5) {
                users.add(userDto);
            }
        }

        Collections.sort(users, new Comparator<UserDto>() {
            @Override
            public int compare(UserDto o1, UserDto o2) {
                return Integer.compare(o2.getIdx(), o1.getIdx());
            }
        });

        List<String> stringList = new ArrayList<>();
        for (UserDto userDto : users) {
            stringList.add(userDto.getName());
            System.out.println("userDto.getName() = " + userDto.getName());
        }
    }

    static void java8Code() {
        List<UserDto> sampleDtoList = new ArrayList<>();
        sampleDtoList.add(new UserDto(1, "name2", "man"));
        sampleDtoList.add(new UserDto(0, "name0", "woman"));
        sampleDtoList.add(new UserDto(2, "name2", "man"));
        sampleDtoList.add(new UserDto(5, "name5", "woman"));
        sampleDtoList.add(new UserDto(4, "name4", "woman"));
        sampleDtoList.add(new UserDto(9, "name9", "woman"));
        sampleDtoList.add(new UserDto(10, "name10", "man"));


        List<UserDto> list = sampleDtoList.stream()
                .filter(d -> d.getIdx() < 5)
                .sorted(Comparator.comparing(UserDto::getIdx))
                .collect(Collectors.toList());

        for (UserDto s : list) {
            System.out.println("s = " + s);
        }
        List<String> parallelList = sampleDtoList.parallelStream()
                .filter(d -> d.getIdx() < 5) // idx가 10보다 작은 데이터 선택
                .sorted(Comparator.comparing(UserDto::getIdx)) // idx 순서로 정렬
                .map(UserDto::getName) // 이름 추출
                .collect(Collectors.toList()); // 리스트로 저장

        for (String s : parallelList) {
            System.out.println("s = " + s);
        }


    }

    /**
     * 스트림은 단 한번만 소비 가능하다.
     */
    static void impossibleNewStream() {
        List<String> title = Arrays.asList("A", "B", "C");
        Stream<String> s = title.stream();

        s.forEach(System.out::println); // A, B, C 출력
        /** java.lang.IllegalStateException:스트림이 이미 소비되었거나 닫힘 에러 발생 */
        s.forEach(System.out::println);
    }
}
