package com.startjava.lesson_4.game;

import java.util.Scanner;

public class Player {
    private final String name;
    private int number;
    private int[] saveNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public void generateNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Игрок " + name + ", введите число: ");
        setNumber(input.nextInt());
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int[] getSaveNumbers() {
        return saveNumbers;
    }

    public void setSaveNumbers(int[] saveNumbers) {
        this.saveNumbers = saveNumbers;
    }
}
