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
        BigDecimal testNumber2 = BigDecimal.valueOf(2);
        BigDecimal expected = BigDecimal.ZERO;
        BigDecimal result = arithmetic.subtraction(testNumber2, testNumber2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void multiplication() {
        BigDecimal testNumber2 = BigDecimal.valueOf(2);
        BigDecimal expected = BigDecimal.valueOf(4);
        BigDecimal result = arithmetic.multiplication(testNumber2, testNumber2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void division() {
        BigDecimal testNumber2 = BigDecimal.valueOf(2);
        BigDecimal expected = BigDecimal.valueOf(1);
        BigDecimal result = arithmetic.addition(testNumber2, testNumber2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void exponentiation() {
        BigDecimal testNumber2 = BigDecimal.valueOf(2);
        BigDecimal expected = BigDecimal.valueOf(4);
        BigDecimal result = arithmetic.addition(testNumber2, testNumber2);
        Assertions.assertEquals(expected, result);
    }
}