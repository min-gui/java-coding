import javax.swing.text.html.Option;
import java.util.*;

public class Main {

    /***
     *
     * 1. 아이디어
     *  이중포문으로 돌며 방문X 또는 1 일경우 탐색
     *
     ***/

    public static void main(String[] args) {

        List<User> list = new ArrayList<>();

        User user1 = new User();
        user1.setName("min");
        list.add(user1);

        User user2 = new User();
        user2.setName("min2");
        list.add(user2);

        Optional<User> result = list.stream()
                .filter(user -> user.getName().equals("min1"))
                .findAny();

        result.ifPresent(m -> {
                    System.out.println("값이 중복이다.");
                }
        );

    }

}

