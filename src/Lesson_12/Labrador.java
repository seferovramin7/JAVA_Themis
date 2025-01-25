package Lesson_12;

public class Labrador extends Retriever {
    String eyeColor;

    public Labrador(String name, int age, String colorOfFur, boolean domestic, String eyeColor) {
        super(name, age, colorOfFur, domestic);
        this.eyeColor = eyeColor;
    }
}
