package Lesson_2;

//Создайте класс WolfTest с методом main
//
//    создайте объект типа Wolf
//    присвойте в нем полям экземпляра класса Wolf какие-то значения
//    считайте эти значения из полей и отобразите в консоли
//    вызовите методы объекта

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.nickname = "Jack";
        wolf.color = "black";
        System.out.println("nickname = " + wolf.nickname);
        System.out.println("color = " + wolf.color);
        System.out.println("age = " + wolf.age);
    }
}
