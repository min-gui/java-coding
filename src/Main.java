import javax.swing.text.html.Option;
import java.util.*;

public class Main {

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

