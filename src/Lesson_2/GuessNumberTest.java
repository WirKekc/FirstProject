package Lesson_2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player player1 = new Player("Ivan");
        Player player2 = new Player("Dmitry");

        player1.generateNumber();
        player2.generateNumber();

//        System.out.print("Игрок " + player1.getName() + ", введите число: " );
//        player1.setNumber(input.nextInt());
//
//        System.out.print("Игрок " + player2.getName() + ", введите число: " );
//        player2.setNumber(input.nextInt());

        GuessNumber guessNumber1 = new GuessNumber(player1.getNumber(), player1.getName());
        GuessNumber guessNumber2 = new GuessNumber(player2.getNumber(), player2.getName());
        boolean isExit = false;
        while (!isExit) {
            int resultPlayer1 = guessNumber1.action();

            int resultPlayer2 = guessNumber2.action();

            if (resultPlayer1 == resultPlayer2){
                System.out.println("Ничья");
            }
            else if (resultPlayer1 < resultPlayer2) {
                System.out.println("Победил игрок " + player1.getName());
            }
            else {
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
                    guessNumber1 = new GuessNumber(player1.getNumber(), player1.getName());
                    guessNumber2 = new GuessNumber(player2.getNumber(), player2.getName());
                    break;
                }
                else {
                    System.out.println("Вы ввели неверные данные. Попробуйте еще раз.");
                    // В Calculator и CalculatorTest, как мне кажется, я лучше реализовал задание с выходим из программы,
                    // но этот способ больше соответсвует требованиям.
                }
            }
        }


    }
}
