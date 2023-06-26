package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.service.CalculatorServiceImpl;


public class CalculatorService {
    private CalculatorServiceImpl service;
    @BeforeEach
    public void setUp() {
        service = new CalculatorServiceImpl();
    }

    @Test
    void helloTest() {
     //   CalculatorServiceImpl service = new CalculatorServiceImpl();
        String expected = "Welcome to calculator";
        String actual =  service.hello();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void plusTest() {
     //   CalculatorServiceImpl service = new CalculatorServiceImpl();
        String expected = "5.00 + 5.00 = 10.00";
        String actual =  service.plus(5.0,5.0);

        Assertions.assertEquals(expected, actual);

        expected = "5.00 + 15.00 = 20.00";
        actual =  service.plus(5.0,15.0);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void minusTest() {
     //   CalculatorServiceImpl service = new CalculatorServiceImpl();
        String expected = "5.00 - 5.00 = 0.00";
        String actual =  service.minus(5.0,5.0);

        Assertions.assertEquals(expected, actual);

        expected = "15.00 - 5.00 = 10.00";
        actual =  service.minus(15.0,5.0);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void multiplyTest() {
     //   CalculatorServiceImpl service = new CalculatorServiceImpl();
        String expected = "5.00 * 5.00 = 25.00";
        String actual =  service.multiply(5.0,5.0);

        Assertions.assertEquals(expected, actual);

        expected = "10.00 * 5.00 = 50.00";
        actual =  service.multiply(10.0,5.0);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void divideTest() {
     //   CalculatorServiceImpl service = new CalculatorServiceImpl();
        String expected = "5.00 / 5.00 = 1.00";
        String actual =  service.divide(5.0,5.0);

        Assertions.assertEquals(expected, actual);

        expected = "10.00 / 5.00 = 2.00";
        actual =  service.divide(10.0,5.0);

        Assertions.assertEquals(expected, actual);
    }
}
