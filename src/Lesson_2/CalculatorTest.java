package Lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            Calculator calc = new Calculator();
            calc.instruction();
            System.out.print("Введите первое число: ");
            calc.setNumber_1(input.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setOperation(input.next());
            System.out.print("Введите второе число: ");
            calc.setNumber_2(input.nextInt());
            calc.calculation();
            if (calc.isExit()){
                break;
            }
        }
    }
}
