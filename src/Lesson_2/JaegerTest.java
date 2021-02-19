package Lesson_2;

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

    }
}
