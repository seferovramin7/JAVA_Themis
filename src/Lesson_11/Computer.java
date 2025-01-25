package Lesson_11;

public class Computer {

    String name;
    int price;

    public Computer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Computer(String name) {
        this.name = name;
    }

    void calculate(int a, int b) {
        System.out.println(a + b);
    }


    @Override
    public String toString() {
        return "Lesson_11.Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
