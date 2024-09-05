package streamprac;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOperation {
    public static void main(String[] args) {
        //operation();
        opretion2();
    }

    static void operation() {
        /* java8 */
        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(1, "name1", "man"),
                new UserDto(0, "name0", "woman"),
                new UserDto(2, "name2", "man"),
                new UserDto(5, "name5", "woman"),
                new UserDto(4, "name4", "woman"),
                new UserDto(9, "name9", "woman"),
                new UserDto(10, "name10", "man")
        );

        List<String> list = userDtoList.stream()
                /** 중간연산 시작 ----------------------- */
                .filter(d -> d.getIdx() < 5) // idx가 5보다 작은 데이터 선택
                .sorted(Comparator.comparing(UserDto::getIdx)) // idx 순서로 정렬
                .map(UserDto::getName) // 이름 추출
                .limit(3) // 선착순 3개만 선택
                /** 최종연산 시작 ----------------------- */
                .collect(Collectors.toList()); // 리스트로 저장

        System.out.println("list = " + list);
    }

    static void opretion2() {
        /* java8 */
        List<UserDto> userDtoList = Arrays.asList(
                new UserDto(1, "name1", "man"),
                new UserDto(0, "name0", "woman"),
                new UserDto(2, "name2", "man"),
                new UserDto(5, "name5", "woman"),
                new UserDto(4, "name4", "woman"),
                new UserDto(9, "name9", "woman"),
                new UserDto(10, "name10", "man")
        );

        List<String> list = userDtoList.stream()
                /** 중간연산 시작 ----------------------- */
                .filter(d -> {
                    System.out.println(d.getName());
                    return d.getIdx() < 5; // return 변경
                })
                .sorted(Comparator.comparing(UserDto::getIdx))
                .map((d) -> {
                    System.out.println(d.getName());
                    return d.getName(); // return 변경
                })
                .limit(3)
                /** 최종연산 시작 ----------------------- */
                .collect(Collectors.toList());

        System.out.println("list2 = " + list);

        Optional<UserDto> list3 = userDtoList.stream()
                .reduce((x,y) -> {
                    int i = x.getIdx() + y.getIdx();
                    return new UserDto(i,null,null);
                });


        System.out.println(list3.get());
    }
}
