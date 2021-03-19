package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        do {
            calc.inputData();
            System.out.println(calc.calculate());
        } while (!isExit());
    }

    public static boolean isExit() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Хотите продолжить вычисления? [y/n]: ");
            String exit = input.nextLine();
            if ("n".equals(exit)) {
                return true;
            } else if ("y".equals(exit)) {
                return false;
            } else {
                System.out.println("Введен неверный ответ! Попробуйте еще раз");
            }
        }
    }
}
