package etc;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {

    @Test
    public void 정규식_연습() throws Exception {

        String input = "hello1234";
        //숫자만 추출
        String regex = "\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println(matcher.group());

        }
    }

    @Test
    public void 이메일_정규식() throws Exception {
        //() 소괄호는 그룹화
        String regex = "(\\w+)@(\\w+\\.\\w+)";
        Matcher matcher = Pattern.compile(regex).matcher("test@example.com");

        if (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }

    }

    @Test
    public void 점앞에_있는_단어_찾기() throws Exception {
        //given
        String regex = "\\b\\w+(?=\\.)"; // 점(.) 앞에 있는 단어를 찾음
        Matcher matcher = Pattern.compile(regex).matcher("Hello.world");

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(0));
        }

    }

    @Test
    public void 정규식_연습_02() throws Exception {
        String input = "acba22b3b asd";

        String regex = "[^a]+";
        String regex2 = "\\D";
        Matcher matcher = Pattern.compile(regex).matcher(input);
        // 매칭 결과 출력
        while (matcher.find()) {
            System.out.println("매칭된 부분: " + matcher.group());
        }

        Matcher matcher2 = Pattern.compile(regex2).matcher(input);

        while (matcher2.find()){
            System.out.println("매칭 2 "+ matcher2.group());
        }

    }


}
