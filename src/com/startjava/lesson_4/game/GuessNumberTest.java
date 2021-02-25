package com.startjava.lesson_4.game;

import java.lang.reflect.Array;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player player1 = new Player("Ivan");
        Player player2 = new Player("Dmitriy");

        player1.inputNumber();
        player2.inputNumber();

        GuessNumber guessNumber1 = new GuessNumber(player1.getNumber(), player1.getName(), player1.getSaveNumbers());
        GuessNumber guessNumber2 = new GuessNumber(player2.getNumber(), player2.getName(), player2.getSaveNumbers());
        boolean isExit = false;
        while (!isExit) {
            int[] resultPlayer1 = guessNumber1.action();
            int[] resultPlayer2 = guessNumber2.action();

            for (int result :resultPlayer1
                 ) {
                System.out.print(result + " ");
            }

            System.out.println();
            for (int result :resultPlayer2
            ) {
                System.out.print(result + " ");
            }
            System.out.println();
            if (resultPlayer1.length == resultPlayer2.length){
                System.out.println("Ничья");
            }
            else if (resultPlayer1.length < resultPlayer2.length) {
                System.out.println("Победил игрок " + player1.getName());
            }
            else {
                System.out.println("Победил игрок " + player2.getName());
            }
            while (!isExit) {
                System.out.print("Хотите продолжить игру? [y/n]: ");
                String answer = input.next();
                if ("n".equals(answer)) {
                    isExit = true;
                } else if ("y".equals(answer)) {
                    player1.inputNumber();
                    player2.inputNumber();
                    guessNumber1 = new GuessNumber(player1.getNumber(), player1.getName(), player1.getSaveNumbers());
                    guessNumber2 = new GuessNumber(player2.getNumber(), player2.getName(), player2.getSaveNumbers());
                    break;
                }
                else {
                    System.out.println("Вы ввели неверные данные. Попробуйте еще раз.");
                }
            }
        }
    }
}
