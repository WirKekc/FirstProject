package com.startjava.lesson_4.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        while (true) {
            Calculator calc = new Calculator();
            calc.inputData();
            System.out.println(calc.calculate());
            if (calc.isExit()) {
                break;
            }
        }
    }
}
