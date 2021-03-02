package com.startjava.lesson_2_3.classwork.wolf;

//Создайте класс WolfTest с методом main
//
//    создайте объект типа Wolf
//    присвойте в нем полям экземпляра класса Wolf какие-то значения
//    считайте эти значения из полей и отобразите в консоли
//    вызовите методы объекта

//Модифицируйте класс WolfTest
//        с помощью сеттеров присвойте полям экземпляра класса Wolf какие-то значения
//        считайте эти значения из полей с помощью геттеров и отобразите в консоли


public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setNickname("Jack");
        wolf.setColor("black");
        wolf.setAge(10);
        wolf.setSex("Male");
        System.out.println("nickname = " + wolf.getNickname());
        System.out.println("color = " + wolf.getColor());
        System.out.println("age = " + wolf.getAge());
        System.out.println("age = " + wolf.getSex());
    }
}
