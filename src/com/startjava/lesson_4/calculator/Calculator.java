package com.startjava.lesson_4.calculator;
//Модифицируйте программу Калькулятор, используя для хранения значений математического выражения массивы:
//        используйте следующий формат ввода математического выражения (пример): Введите математическое выражение: 2 ^ 10`
//        для разбиения математического выражения на составляющие и сохранения их в массив, используйте метод String.split();
//        для преобразования аргументов математического выражения из String в int используйте метод Integer.parseInt
//        воспользуйтесь методами класса Math, какие только сможете найти, заменив ими ваши реализации, связанные с вычислениями
//        метод calculate должен возвращать результат вычисления. Выводите его в CalculatorTest

import java.util.Scanner;

public class Calculator {
    private String operation;
    private int number_1;
    private int number_2;

    public void inputData(){
        System.out.print("Введите математическое выражение: ");
        Scanner input = new Scanner(System.in);
        String[] data = input.nextLine().split(" ");
//        тут бы try catch, но мы его еще не прошли, поэтому не буду бежать впереди паравоза
        number_1 = Integer.parseInt(data[0]);
        number_2 = Integer.parseInt(data[2]);
        operation = data[1];
    }

    public int calculate(){
        switch (operation) {
            case "+":
                return (number_1 + number_2);
            case "-":
                return (number_1 - number_2);
            case "*":
                return (number_1 * number_2);
            case "/":
                if (number_2 == 0) {
                    System.out.println("Деление на 0 запрещено!");
                    return -1;
                } else {
                    return (number_1 / number_2);
                }
            case "^":
                return (int)(Math.pow(number_1, number_2));
            case "%":
                return (number_1 % number_2);
            default:
                System.out.println("Вы ввели не верные данные");
                return -1;
        }
    }

    public boolean isExit(){
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Хотите продолжить вычисления? [y/n]: ");
            String exit = input.nextLine();
            if ("n".equals(exit)) {
                return true;
            } else if ("y".equals(exit)) {
                return false;
            }
            else {
                System.out.println("Введен неверный ответ! Попробуйте еще раз");
            }
        }
    }
}
