package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pro.sky.calculator.exception.IllegalDividerException;
import pro.sky.calculator.service.CalculatorServiceImpl;


public class CalculatorService {
    private CalculatorServiceImpl service;
    @BeforeEach
    public void setUp() {
        service = new CalculatorServiceImpl();
    }

    @Test
    void helloTest() {
        String expected = "Welcome to calculator";
        String actual =  service.hello();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void plusTest() {
        String expected = "5.00 + 5.00 = 10.00";
        String actual =  service.plus(5.0,5.0);

        Assertions.assertEquals(expected, actual);

        expected = "5.00 + 15.00 = 20.00";
        actual =  service.plus(5.0,15.0);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void minusTest() {
        String expected = "5.00 - 5.00 = 0.00";
        String actual =  service.minus(5.0,5.0);

        Assertions.assertEquals(expected, actual);

        expected = "15.00 - 5.00 = 10.00";
        actual =  service.minus(15.0,5.0);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void multiplyTest() {
        String expected = "5.00 * 5.00 = 25.00";
        String actual =  service.multiply(5.0,5.0);

        Assertions.assertEquals(expected, actual);

        expected = "10.00 * 5.00 = 50.00";
        actual =  service.multiply(10.0,5.0);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void divideTest() {
        String expected = "5.00 / 5.00 = 1.00";
        String actual =  service.divide(5.0,5.0);

        Assertions.assertEquals(expected, actual);

        expected = "10.00 / 5.00 = 2.00";
        actual =  service.divide(10.0,5.0);

        Assertions.assertEquals(expected, actual);
    }
    @Test
     public void divideExceptionTest() throws IllegalDividerException {

        try {
            String actual = service.divide(5.0, 0.0);
        } catch (IllegalDividerException thrown) {
            Assertions.assertEquals("Division by 0", thrown.getMessage());
        }

    }

        @ParameterizedTest
        @CsvSource(value = {
                "5.00 + 5.00 = 10.00, 5.0, 5.0",
                "5.00 + 15.00 = 20.00, 5.0, 15.0",
                "5.00 + 4.00 = 9.00, 5.0, 4.0"
        }, ignoreLeadingAndTrailingWhitespace = true)
        void plusParamTest(String expected, double num1, double num2) {
            String actual =  service.plus(num1,num2);
            Assertions.assertEquals(expected, actual);
        }
    @ParameterizedTest
    @CsvSource(value = {
            "5.00 - 5.00 = 0.00, 5.0, 5.0",
            "15.00 - 10.00 = 5.00, 15.0, 10.0",
            "5.00 - 4.00 = 1.00, 5.0, 4.0"
    }, ignoreLeadingAndTrailingWhitespace = true)
    void minusParamTest(String expected, double num1, double num2) {
        String actual =  service.minus(num1,num2);
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource(value = {
            "5.00 * 5.00 = 25.00, 5.0, 5.0",
            "15.00 * 10.00 = 150.00, 15.0, 10.0",
            "5.00 * 4.00 = 20.00, 5.0, 4.0"
    }, ignoreLeadingAndTrailingWhitespace = true)
    void multiplyParamTest(String expected, double num1, double num2) {
        String actual =  service.multiply(num1,num2);
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource(value = {
            "5.00 / 5.00 = 1.00, 5.0, 5.0",
            "150.00 / 10.00 = 15.00, 150.0, 10.0",
            "12.00 / 4.00 = 3.00, 12.0, 4.0"
    }, ignoreLeadingAndTrailingWhitespace = true)
    void divideParamTest(String expected, double num1, double num2) {
        String actual =  service.divide(num1,num2);
        Assertions.assertEquals(expected, actual);
    }

}
