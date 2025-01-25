package Lesson_12;

public class Wolf {
    String name;
    int age;
    String colorOfFur;


    public Wolf(String name, int age, String colorOfFur) {
        this.name = name;
        this.age = age;
        this.colorOfFur = colorOfFur;
    }

    public String sound() {
        return "Woof!";
    }

    public final void breathing() {
        System.out.println("Breathing");
    }

    public void eating() {
        System.out.println("Hunting");
    }


}
