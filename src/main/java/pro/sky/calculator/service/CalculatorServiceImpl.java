package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.exception.IllegalDividerException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String plus(double num1, double num2) {
        String result=String.format("%.2f + %.2f = %.2f", num1, num2, num1 + num2);
        return result;
    }

    @Override
    public String minus(double num1, double num2) {
        String result=String.format("%.2f - %.2f = %.2f", num1, num2, num1 - num2);
        return result;
    }

    @Override
    public String multiply(double num1, double num2) {
        String result=String.format("%.2f * %.2f = %.2f", num1, num2, num1 * num2);
        return result;
    }

    @Override
    public String divide(double num1, double num2) {

        if(num2 == 0) {
            System.out.println("Division by 0");
            throw new IllegalDividerException("Division by 0");
        }
        String result=String.format("%.2f / %.2f = %.2f", num1, num2, num1 / num2);
        return result;
    }

    public String hello() {
        return "Welcome to calculator";
    }
}
