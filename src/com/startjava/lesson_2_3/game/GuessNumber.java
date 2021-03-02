package com.startjava.lesson_2_3.game;

//Модифицируйте программу Угадай число:
//
//        реализуйте класс GuessNumber, Player и GuessNumberTest
//        создайте двух игроков, которые по очереди будут пытаться угадать число (вводя его с клавиатуры), загаданное компьютером
//        имена игроков вводите с клавиатуры перед запуском игры
//        создайте в GuessNumber два поля типа Player
//        поля объектов (Игроков, Игры) инициализируйте с помощью конструкторов
//        для генерации компьютером псевдослучайного числа в диапазоне (0, 100] используйте класс Random
//        одержать победу может только один игрок
//        для завершения или продолжения работы программы Угадай число, выводите сообщение: "Хотите продолжить игру? [да/нет]:".
//        Выводите его до тех пор, пока не будет введено "да" или "нет" (реализуйте эту логику в GuessNumberTest)

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final String playerName;
    private int inputNumber;

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    public GuessNumber(int inputNumber, String playerName) {
        this.inputNumber = inputNumber;
        this.playerName = playerName;
    }

    public int action() {
        int number = random.nextInt(100);
        System.out.println("Играет " + playerName + "!");
        int attemptNumber = 0;
        while (true) {
            System.out.println(playerName + " ввел число " + inputNumber);
            if (inputNumber < number) {
                System.out.println("Введенное игроком " + playerName + " число меньше того, что загадал компьютер");
                System.out.print("Игрок " + playerName + ", введите еще раз число: ");
                inputNumber = input.nextInt();
                attemptNumber++;
            } else if (inputNumber > number) {
                System.out.println("Введенное игроком " + playerName + " число больше того, что загадал компьютер");
                System.out.print("Игрок " + playerName + ", введите еще раз число: ");
                inputNumber = input.nextInt();
                attemptNumber++;
            } else {
                System.out.println(playerName + " угадал! Число попыток: " + attemptNumber);
                System.out.println("==========================================================");
                return attemptNumber;
            }
        }
    }
}