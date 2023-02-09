package utn.frc.tup.lciii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ArithmeticTest {

    private Arithmetic arithmetic = new Arithmetic();

    @Test
    void addition() {
        BigDecimal testNumber2 = BigDecimal.valueOf(2);
        BigDecimal expected = BigDecimal.valueOf(4);
        BigDecimal result = arithmetic.addition(testNumber2, testNumber2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void subtraction() {
    }

    @Test
    void multiplication() {
    }

    @Test
    void division() {
    }

    @Test
    void exponentiation() {
    }
}