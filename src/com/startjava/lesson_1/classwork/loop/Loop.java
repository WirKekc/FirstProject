package com.startjava.lesson_1.classwork.loop;// Создайте класс com.startjava.Lesson_1.Cycle с методом main
// Выведите на консоль с помощью цикла for все числа от [0, 20]
// Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
// Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль

public class Loop {
    public static void main(String[] args) {
        System.out.println("FOR:");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("\nWHILE:");
        int i = -6;
        while (i < 7) {
            System.out.println(i);
            i = i + 2;
        }

        System.out.println("DO-WHILE");
        int j = 10;
        int sum = 0;
        do {
            if (j % 2 == 1) {
                sum += j;
            }
            j++;
        } while (j <= 20);
        System.out.println(sum);
    }
}
