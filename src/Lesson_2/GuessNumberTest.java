package Lesson_2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
        while (true) {
            System.out.println("Введите число: ");
            int input_number = input.nextInt();
            if (input_number < number) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if (input_number > number) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали!");
                break;
            }
        }
    }
}
