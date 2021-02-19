package Lesson_2;

public class JaegerV2 {
    public JaegerV2(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
        assert modelName != null;
        this.modelName = modelName;
        assert mark!= null;
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

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public void move(){
        System.out.println("Вы прошли 5 шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

}
