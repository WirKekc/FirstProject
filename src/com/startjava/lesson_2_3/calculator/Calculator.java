package com.startjava.lesson_2_3.calculator;
//Модифицируйте программу Калькулятор:
//
//        реализуйте дополнительный класс CalculatorTest, перенеся в него метод main
//        класс Calculator будет отвечать за проверку знака и мат. вычисления
//        для выбора вычисления той или иной математической операции используйте проверку математического знака с помощью switch
//        для ввода мат. выражения используйте клавиатуру (класс Scanner)
//        формат ввода математического выражения:
//        Введите первое число: 2
//        Введите знак математической операции: ^
//        Введите второе число: 10
//        для завершения или продолжения работы программы Калькулятор, выводите сообщение: "Хотите продолжить вычисления? [да/нет]:".
//        Выводите его до тех пор, пока не будет введено "да" или "нет" (реализуйте эту логику в CalculatorTest)

import java.util.Scanner;

public class Calculator {
    private String operation;
    private int number_1;
    private int number_2;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setNumber_1(int number_1) {
        this.number_1 = number_1;
    }

    public void setNumber_2(int number_2) {
        this.number_2 = number_2;
    }

    public void instruction() {
        System.out.println("Список операций:");
        System.out.println("'+' -  сложение; ");
        System.out.println("'-' -  вычетание; ");
        System.out.println("'*' -  умножение; ");
        System.out.println("'/' -  деление; ");
        System.out.println("'^' -  возведение в степень; ");
        System.out.println("'%' -  деление по модулю;");
    }

    public void calculation() {
        switch (operation) {
            case "+":
                System.out.printf("%d + %d = " + (number_1 + number_2) + "\n", number_1, number_2);
                break;
            case "-":
                System.out.printf("%d - %d = " + (number_1 - number_2) + "\n", number_1, number_2);
                break;
            case "*":
                System.out.printf("%d * %d = " + (number_1 * number_2) + "\n", number_1, number_2);
                break;
            case "/":
                if (number_2 == 0) {
                    System.out.println("Деление на 0 запрещено!");
                } else {
                    System.out.format("%d / %d = " + (number_1 / number_2) + "\n", number_1, number_2);
                }
                break;
            case "^":
                if (number_2 == 0) {
                    System.out.format("%d ^ %d = 1\n", number_1, number_2);
                } else {
                    float temp_number = 1;
                    for (int i = 0; i < number_2; i++) {
                        temp_number = temp_number * number_1;
                    }
                    System.out.printf("%d ^ %d = " + (temp_number) + "\n", number_1, number_2);
                }
                break;
            case "%":
                System.out.printf(("%d % %d = " + number_1 % number_2) + "\n", number_1, number_2);
                break;
            default:
                System.out.println("Вы ввели не верные данные");
                break;
        }
    }

    public boolean isExit() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Хотите продолжить вычисления? [да/нет]: ");
            String exit = input.nextLine();
            if (exit.equals("нет")) {
                return true;
            } else if (exit.equals("да")) {
                return false;
            } else {
                System.out.println("Введен неверный ответ! Попробуйте еще раз");
            }
        }
    }
}
