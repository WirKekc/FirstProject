/*
Создайте класс ConditionalStatement с методом main
Перепишите псевдокод, приведенный ниже, с помощью языка Java
Используйте переменные и условные операторы
Выводите сообщения на консоль
Попробуйте применить оператор ! (логическое НЕ)
Не используйте String

ЕСЛИ(возраст > 20) {
    сообщение
}

ЕСЛИ(мужскойПол) {
    сообщение
}

ЕСЛИ(!мужскойПол) {
    сообщение
}

ЕСЛИ(рост < 1.80) {
    сообщение
} ИНАЧЕ {
    сообщение
}

ЕСЛИ(перваяБукваИмени == ‘M’) {
    сообщение
} ИНАЧЕ ЕСЛИ(перваяБукваИмени == ‘I’) {
    сообщение
} ИНАЧЕ {
    сообщение
}
 */

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 32;
        boolean isSexMale = true;
        double height = 1.70;
        char firstLetterName = 'D';

        if (age > 20){
            System.out.println("Вам больше 20!");
        }
        if (!isSexMale){
            System.out.println("Ваш пол женский");
        }
        if (height < 1.80){
            System.out.println("Ваш рост меньше 1.80");
        }
        else{
            System.out.println("Ваш рост больште либо равен 1.80");
        }
        if (firstLetterName == 'M'){
            System.out.println("Ваше имя начинается на букву 'M'");
        }
        else if (firstLetterName == 'I'){
            System.out.println("Ваше имя начинается на букву 'I'");
        }
        else {
            System.out.println("Ваше имя не начинается на буквы 'M' или 'I'");
        }
    }
}
