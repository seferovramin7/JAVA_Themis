package Lesson_11;

public class Main {
    public static void main(String[] args) {


        Computer asus = new Computer("Asus", 2222);

        Human dost = new Human("Jennifer", 23, "Guneshli", asus);

        Human[] dostlar = new Human[5];
        dostlar[0] = dost;

        Human insan1 = new Human("Qabil", 23, "Guneshli", asus, dostlar);

        insan1.setAddress("Yasamal");

        System.out.println(insan1.name);
        System.out.println(insan1.getAddress());
    }
}
