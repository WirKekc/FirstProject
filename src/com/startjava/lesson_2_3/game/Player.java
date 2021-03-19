package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class Player {
    private final String name;
    private int number;

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
}
