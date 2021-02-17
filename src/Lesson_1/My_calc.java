package Lesson_1;
//Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) над целыми положительными числами:
//
//        для выбора вычисления той или иной математической операции используйте проверку математического знака с помощью if else
//        выведите на экран результат вычисления с помощью System.out.println()
//        Символ ^ используется в данном задании для обозначения операции возведения в степень, но в Java он выполняет совсем иную функцию. Самостоятельно реализуйте операцию возведения в степень
//        Символ%, похожий на проценты, называется оператором деления по модулю. В калькуляторе не надо считать проценты! Считайте остаток от деления

public class My_calc {
    public static void main(String[] args) {
        char operation = '^';
        float a = 2;
        float b = 10;
        if (operation == '+') {
            System.out.println("a + b = " + (a + b));
        }
        else if (operation == '-'){
            System.out.println("a - b = " + (a - b));
        }
        else if (operation == '*'){
            System.out.println("a * b = " + (a * b));
        }
        else if (operation == '/'){
            if (b == 0){
                System.out.println("Деление на 0 запрещено!");
            }
            else {
                System.out.println("a / b = " + (a / b));
            }
        }
        else if (operation == '^'){
            if (b == 0){
                System.out.println("a ^ b = 1");
            }
            else {
                float c = 1;
                for (int i = 0; i < b; i++) {
                    c = c * a;
                }
                System.out.println("a ^ b = " + c);
            }
        }
        else if (operation == '%'){
            System.out.println("a % b = " + (a % b));
        }
        else{
            System.out.println("Вы ввели не верные данные");
        }
    }
}
