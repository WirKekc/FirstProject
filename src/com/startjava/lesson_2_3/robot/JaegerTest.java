package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Crimson Typhoon");
        jaegerOne.setOrigin("China");
        jaegerOne.setMark("Mark 2");
        jaegerOne.setHeight(83.8f);
        jaegerOne.setWeight(3.7f);
        jaegerOne.setSpeed(2);
        jaegerOne.setStrength(9);
        jaegerOne.setArmor(10);
        System.out.println("modelName = " + jaegerOne.getModelName());
        System.out.println("mark = " + jaegerOne.getMark());
        System.out.println("origin = " + jaegerOne.getOrigin());
        System.out.println("height = " + jaegerOne.getHeight());
        System.out.println("weight = " + jaegerOne.getWeight());
        System.out.println("speed = " + jaegerOne.getSpeed());
        System.out.println("strength = " + jaegerOne.getStrength());
        System.out.println("armor = " + jaegerOne.getArmor());

        System.out.println("=============================");

        JaegerV2 jaegerV2 = new JaegerV2("Big Robot", "Mark 8", "Russia", 89.8f,
                3.8f, 8, 8, 9);
        System.out.println("modelName = " + jaegerV2.getModelName());
        System.out.println("mark = " + jaegerV2.getMark());
        System.out.println("origin = " + jaegerV2.getOrigin());
        System.out.println("height = " + jaegerV2.getHeight());
        System.out.println("weight = " + jaegerV2.getWeight());
        System.out.println("speed = " + jaegerV2.getSpeed());
        System.out.println("strength = " + jaegerV2.getStrength());
        System.out.println("armor = " + jaegerV2.getArmor());

    }
}
