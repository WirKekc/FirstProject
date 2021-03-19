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

import java.util.Arrays;
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

    private int[] act(String playerName, int inputNumber, int[] saveNumbers) {
        int number = random.nextInt(100);
        System.out.println("Играет " + playerName + "!");
        System.out.println("У вас 10 попыток");
        int attemptNumber = 0;
        while (true) {
            if(attemptNumber >= 9) {
                System.out.println("У " + playerName + " закончились попытки");
                return Arrays.copyOf(saveNumbers, attemptNumber);
            }
            System.out.println(playerName + " ввел число " + inputNumber + "  - " + attemptNumber);
            if (inputNumber < number) {
                System.out.println("Введенное игроком " + playerName + " число меньше того, что загадал компьютер");
                System.out.print("Игрок " + playerName + ", введите еще раз число: ");
                inputNumber = input.nextInt();
                saveNumbers[attemptNumber] = inputNumber;
                attemptNumber++;
            } else if (inputNumber > number) {
                System.out.println("Введенное игроком " + playerName + " число больше того, что загадал компьютер");
                System.out.print("Игрок " + playerName + ", введите еще раз число: ");
                inputNumber = input.nextInt();
                saveNumbers[attemptNumber] = inputNumber;
                attemptNumber++;
            }  else {
                System.out.println("Игрок " + playerName + " угадал число " + number + " с " + attemptNumber + " попытки");
                System.out.println("==========================================================");
                return Arrays.copyOf(saveNumbers, attemptNumber);
            }
        }
    }

    private void printResults(int[] results){
        for (int result: results) {
            System.out.print(result + " ");
        }
        System.out.println();
    }

    public void action(){
        player1.generateNumber();
        player2.generateNumber();
        boolean isExit = false;
        while (!isExit) {
            int[] resultPlayer1 = act(player1.getName(), player1.getNumber(), player1.getSaveNumbers());
            int[] resultPlayer2 = act(player2.getName(), player2.getNumber(), player2.getSaveNumbers());
            printResults(resultPlayer1);
            printResults(resultPlayer2);
            if (resultPlayer1 == resultPlayer2) {
                System.out.println("Ничья");
            } else if (resultPlayer1.length < resultPlayer2.length) {
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
                    Arrays.fill(resultPlayer1, 0);
                    player2.generateNumber();
                    Arrays.fill(resultPlayer2, 0);
                    break;
                } else {
                    System.out.println("Вы ввели неверные данные. Попробуйте еще раз.");
                }
            }
        }
    }
}