package com.startjava.lesson_4.game;

//Модифицируйте программу Угадай число, используя для хранения, названных игроками чисел, массивы:
//
//        перед началом игры выведите сообщение: У вас 10 попыток
//        создайте дополнительное поле в классе Player, которое будет хранить введенные пользователем числа
//        по окончанию игры отобразите, в две строки через пробел, все названные игроками числа (даже если никто не выиграл)
//        если массив полностью не заполнен, т.е. пользователь угадал число менее чем за 10 попыток, то выводить весь массив не нужно
//        для считывания части массива используйте метод Arrays.copyOf
//        в конце игры выведите сообщение "Игрок " + имя + " угадал число " + число + " с " + номер + " попытки"
//        если игроки не угадали число за 10 попыток, то отобразите сообщение: "У " + имя + " закончились попытки"
//        для обнуления массивов игроков, при повторном запуске игры, используйте метод Arrays.fill().
//        При этом обнуляйте только те ячейки, где хранятся, названные игроками числа
//        попробуйте улучшить читаемость кода, разделив его на небольшие методы (рефакторинг)

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final String playerName;
    private int inputNumber;
    private final int[] savePlayerNumbers;

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    public GuessNumber(int inputNumber, String playerName, int[] savePlayerNumbers) {
        this.inputNumber = inputNumber;
        this.playerName = playerName;
        this.savePlayerNumbers = savePlayerNumbers;
    }

    Player player1 = new Player("Ivan");
    Player player2 = new Player("Dmitry");

    public int[] action() {
        int attempt = 10;
        int number = random.nextInt(100);
        System.out.println("Играет " + playerName + "!");
        System.out.println("У вас 10 попыток");
        for (int i = 0; i < 10; i++) {
            savePlayerNumbers[i] = inputNumber;
            System.out.println(playerName + " ввел число " + inputNumber);
            if ((inputNumber < number) && (i < 9)) {
                System.out.println("Введенное игроком " + playerName + " число меньше того, что загадал компьютер");
                System.out.print("Игрок " + playerName + ", введите еще раз число: ");
                inputNumber = input.nextInt();
            } else if ((inputNumber > number) && (i < 9)) {
                System.out.println("Введенное игроком " + playerName + " число больше того, что загадал компьютер");
                System.out.print("Игрок " + playerName + ", введите еще раз число: ");
                inputNumber = input.nextInt();

            } else if (inputNumber == number) {
                System.out.println("Игрок " + playerName + " угадал число " + number + " с " + (i + 1) + "'ой попытки!");
                System.out.println("==========================================================");
                attempt = i + 1;
                return Arrays.copyOf(savePlayerNumbers, attempt);
            }
        }
        System.out.println("У " + playerName + " закончились попытки");
        return Arrays.copyOf(savePlayerNumbers, attempt);
    }
}