package Lesson_2;

// Создайте класс Wolf
//
//    напишите в нем поля: пол, кличка, вес, возраст, окрас
//    напишите в нем методы: идти, сидеть, бежать, выть, охотиться
//
//Модифицируйте класс Wolf
//
//        у всех полей класса напишите модификатор доступа private
//    у всех методов класса напишите модификатор доступа public
//    для доступа к полям создайте геттеры и сеттеры
//    в сеттере поля age реализуйте проверку: если возраст волка > 8 лет, то выведите сообщение "Некорректный возраст".
//    В противном случае сохраните значение в поле

public class Wolf {
    private String sex = "Male";
    private String nickname = "Seryy";
    private int age = 5;
    private String color = "gray";

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age > 8){
            System.out.println("Некорректный возраст");
        }
        else {
            this.age = age;
        }
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void  go(){

    }

    public void sit(){

    }

    public void run(){

    }

    public void howl(){

    }
    public void hunt(){

     }
}
