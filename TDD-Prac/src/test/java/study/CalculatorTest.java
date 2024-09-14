package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertThat(calculator.divide(6, 3)).isEqualTo(2);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        ;
        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> calculator.divide(6, 0));
    }

    @Test
    public void testDivideOverflow() {
        Calculator calculator = new Calculator();
        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> calculator.divide(Integer.MIN_VALUE, -1))
                .withMessage("Overflow: Cannot divide Integer.MIN_VALUE by -1");
    }

    @Test
    public void testDivideWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertThat(calculator.divide(-6, 3)).isEqualTo(-2);
        assertThat(calculator.divide(6, -3)).isEqualTo(-2);
        assertThat(calculator.divide(-6, -3)).isEqualTo(2);
    }

    @Test
    public void 쉼표_구분자_sum() throws Exception {
        int result = Calculator.splitSum("1,2,3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void 쉼표_콜론_구분자_sum() throws Exception {
        int result = Calculator.splitSum("1,2:3");
        assertThat(result).isEqualTo(6);
    }


    @Test
    public void null_빈문자열_테스트() throws Exception {
        int result = Calculator.splitSum(null);
        assertThat(result).isEqualTo(0);

        result = Calculator.splitSum(" ");
        assertThat(result).isEqualTo(0);
    }


    @Test
    public void 커스텀_구분자_sum() throws Exception {
        int result = Calculator.splitSum("//;\n1;2;3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void 음수값_에러_표출() throws Exception {
        assertThatThrownBy(Calculator.splitSum("-1,2,3"))
                .isExactlyInstanceOf(RuntimeException.class)
                .hasMessageContaining("-2");

    }

    @Test
    public void 숫자_하나일_경우() throws Exception {
        int result = Calculator.splitSum("1");
        assertThat(result).isEqualTo(1);

    }

}
