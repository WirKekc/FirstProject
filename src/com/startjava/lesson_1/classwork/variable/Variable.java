package com.startjava.lesson_1.classwork.variable;
/*
Создайте класс com.startjava.Lesson_1.classwork.variable.Variable с методом main
Объявите в методе переменные всех существующих в Java примитивных типов данных. Каждой переменной присвойте значение
В качестве значений используйте информацию о своем компьютере: количество ядер, частота процессора и тд.
Выведите все значения переменных на консоль
Разберитесь с Git/GitHub, почитайте рекомендации о том, как с ними работать
Покажите Д/З наставнику (присылайте ссылку с дз на гитхаб)
*/

public class Variable {
    public static void main(String[] args) {
        byte cpu = 5;
        short RAM = 16384;
        int testInt = 45620078;
        long testLong = 1234567890;
        float testFloat = 3.4393245f;
        double testDouble = 45.245356d;
        char testChar = 'Z';
        boolean testBool = true;
        System.out.println(cpu + "\n" + RAM + "\n" + testInt + "\n" + testLong + "\n" + testFloat + "\n" + testDouble + "\n" + testChar + "\n" + testBool);
    }
}
