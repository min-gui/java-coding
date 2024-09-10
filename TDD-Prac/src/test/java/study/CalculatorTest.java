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


}
