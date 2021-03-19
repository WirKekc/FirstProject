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

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    Player player1 = new Player(enterPlayerName());
    Player player2 = new Player(enterPlayerName());


    private String enterPlayerName(){
        System.out.print("Введите имя игрока: ");
        return input.nextLine();
    }

    private int act(String playerName, int inputNumber) {
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

    public void action(){
        player1.generateNumber();
        player2.generateNumber();
        boolean isExit = false;
        while (!isExit) {
            int resultPlayer1 = act(player1.getName(), player1.getNumber());
            int resultPlayer2 = act(player2.getName(), player2.getNumber());
            if (resultPlayer1 == resultPlayer2) {
                System.out.println("Ничья");
            } else if (resultPlayer1 < resultPlayer2) {
                System.out.println("Победил игрок " + player1.getName());
            } else {
                System.out.println("Победил игрок " + player2.getName());
            }
            while (!isExit) {
                System.out.println("Хотите продолжить игру? [y/n]:");
                String answer = input.next();
                if ("n".equals(answer)) {
                    isExit = true;
                } else if ("y".equals(answer)) {
                    player1.generateNumber();
                    player2.generateNumber();
                    break;
                } else {
                    System.out.println("Вы ввели неверные данные. Попробуйте еще раз.");
                }
            }
        }
    }
}