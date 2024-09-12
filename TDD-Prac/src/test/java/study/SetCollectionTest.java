package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

@DisplayName("Set Collection 학습")
public class SetCollectionTest {

    private Set<Integer> integerSet;

    //각 메서드 실행 되기 전에 한번 실행된다.
    @BeforeEach
    void beforeEach(){
        integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(2);
    }


    @Test
    @DisplayName("Set 크기 확인")
    public void setTest() throws Exception {

        Assertions.assertThat(integerSet.size()).isEqualTo(2);

    }

    @Test
    @DisplayName("Set 존재 확인")
    public void setTest02() throws Exception {

        Assertions.assertThat(integerSet).contains(1);

    }


    @ParameterizedTest(name = "{displayName} {index}이 존재 하는지 확인")
//    @CsvSource(value = {"1,true", "2,true", "3,true", "4,false", "5,false"})
    @ValueSource(strings = {"1", "2", "3", "4", "5"})
    @DisplayName("값 존재 여부 확인")
    void contains_02(int value) {
        Assertions.assertThat(integerSet).contains(value);
    }

}
