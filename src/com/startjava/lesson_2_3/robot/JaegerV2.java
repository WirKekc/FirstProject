package com.startjava.lesson_2_3.robot;

public class JaegerV2 {
    public JaegerV2(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
        assert modelName != null;
        this.modelName = modelName;
        assert mark != null;
        this.mark = mark;
        assert origin != null;
        this.origin = origin;
        assert height != 0;
        this.height = height;
        assert weight != 0;
        this.weight = weight;
        assert speed != 0;
        this.speed = speed;
        assert strength != 0;
        this.strength = strength;
        assert armor != 0;
        this.armor = armor;
    }

    private final String modelName;
    private final String mark;
    private final String origin;
    private final float height;
    private final float weight;
    private final int speed;
    private final int strength;
    private final int armor;

    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }
}
