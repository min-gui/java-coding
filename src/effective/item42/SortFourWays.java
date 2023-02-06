package effective.item42;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortFourWays {

    public static void main(String[] args) {

        String[] strings = {"min55", "sub4", "ok", "yes666"};
        List<String> words = Arrays.asList(strings);

        // 코드 42-1 익명 클래스의 인스턴스를 함수 객체로 사용 - 낡은 기법이다! (254쪽)
        Collections.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println(words);
        Collections.shuffle(words);
        System.out.println(words);

        Collections.sort(words,
                (s1, s2)-> Integer.compare(s2.length(),s1.length()));
        System.out.println("words = " + words);
        Collections.shuffle(words);
        words.sort(Comparator.comparing(String::length));
        System.out.println("words = " + words);

        
    }
}
