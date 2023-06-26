package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }
    @GetMapping()
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorService.divide(num1, num2);
    }
}
