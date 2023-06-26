package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String plus(double num1, double num2) {
        String result=String.format("%f + %f = %f", num1, num2, num1 + num2);
        return result;
    }

    @Override
    public String minus(double num1, double num2) {
        String result=String.format("%f - %f = %f", num1, num2, num1 - num2);
        return result;
    }

    @Override
    public String multiply(double num1, double num2) {
        String result=String.format("%f * %f = %f", num1, num2, num1 * num2);
        return result;
    }

    @Override
    public String divide(double num1, double num2) {
        String result=String.format("%f / %f = %f", num1, num2, num1 / num2);
        return result;
    }
}
