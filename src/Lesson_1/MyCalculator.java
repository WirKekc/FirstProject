package Lesson_1;
//Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) над целыми положительными числами:
//
//        для выбора вычисления той или иной математической операции используйте проверку математического знака с помощью if else
//        выведите на экран результат вычисления с помощью System.out.println()
//        Символ ^ используется в данном задании для обозначения операции возведения в степень, но в Java он выполняет совсем иную функцию. Самостоятельно реализуйте операцию возведения в степень
//        Символ%, похожий на проценты, называется оператором деления по модулю. В калькуляторе не надо считать проценты! Считайте остаток от деления

import java.util.Scanner;

public class My_calc_v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Список операций:");
        System.out.println("'+' -  сложение; ");
        System.out.println("'-' -  вычетание; ");
        System.out.println("'*' -  умножение; ");
        System.out.println("'/' -  деление; ");
        System.out.println("'^' -  возведение в степень; ");
        System.out.println("'%' -  деление по модулю; ");
        System.out.println("Введите операцию из списка операций: ");
        String operation = input.nextLine();

        System.out.println("Введите первое число: ");
        float a = input.nextFloat();
        System.out.println("Введите второе число: ");
        float b = input.nextFloat();

        if (operation.equals("+")) {
            System.out.println("a + b = " + (a + b));
        }
        else if (operation.equals("-")){
            System.out.println("a - b = " + (a - b));
        }
        else if (operation.equals("*")){
            System.out.println("a * b = " + (a * b));
        }
        else if (operation.equals("/")){
            if (b == 0){
                System.out.println("Деление на 0 запрещено!");
            }
            else {
                System.out.println("a / b = " + (a / b));
            }
        }
        else if (operation.equals("^")){
            if (b == 0){
                System.out.println("a ^ b = 1");
            }
            else {
                float temp_number = 1;
                for (int i = 0; i < b; i++) {
                    temp_number = temp_number * a;
                }
                System.out.printf("%f ^ %f = " + (temp_number), a, b);
            }
        }
        else if (operation.equals("%")){
            System.out.println("a % b = " + (a % b));
        }
        else{
            System.out.println("Вы ввели не верные данные");
        }
    }
}
