package Lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        calc.instruction();
        calc.setNumber_1(input.nextFloat());
        calc.setOperation(input.nextLine());
        calc.setNumber_2(input.nextFloat());

        while (true) {
            calc.calculation();
            if (calc.isExit()){
                break;
            }
        }
    }
}
