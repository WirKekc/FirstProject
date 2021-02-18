package Lesson_2;

//Модифицируйте класс Jaeger, сделав его универсальным (без инициализации полей в самом классе, как мы это делали в уроке).
// Это позволит на его основе создавать любого робота:
//        информацию о роботах можно найти здесь
//        выберите два или более разных роботов. Найдите между ними что-то общее (поля, методы). Реализуйте это в коде
//        (не усложняйте реализацию. Делайте все максимально просто)
//        создайте 2 экземпляра класса Jaeger в классе JaegerTest и поэкспериментируйте с ними (проинициализируйте поля,
//        вызывайте методы, перезаписывайте и выводите значения полей)
//        для инициализации полей объектов при их создании используйте в начале сеттеры (покажите решение ментору),
//        а потом перепишите, используя конструктор (1, 2)


public class Jaeger {
    private String modelName = "Bracer Phoenix";
    private String mark = "Mark 5";
    private String origin = "USA";
    private float height = 70.7f;
    private float weight = 2.1f;
    private int speed = 3;
    private int strength = 8;
    private int armor = 9;

    public String getModelName(){
        return modelName;
    }

    public boolean drift(){
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move(){
        System.out.println("Вы прошли 5 шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

}
