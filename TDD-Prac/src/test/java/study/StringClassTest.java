package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("String 클래스 테스트")
public class StringClassTest {

    @Test
    @DisplayName("1,2을 분리학 불리된 결과가 [\"1\", \"2\"] 인지 판다")
    public void splitTest() throws Exception {

        String[] split = "1,2".split(",");

        Assertions.assertThat(split).containsExactly("1", "2");


     }

     @Test
     @DisplayName(", 가 없을때도 정상적으로 변환 확인.")
     public void spritTest02() throws Exception {

         String[] split = "1".split(",");

         Assertions.assertThat(split).containsExactly("1");

      }

      @Test
      @DisplayName("substring 테스트")
      public void substringTest() throws Exception {

          String ex = "abc";
          String result = "abc".substring(1, ex.length() - 1);
          Assertions.assertThat(result).isEqualTo("b");

       }






}
