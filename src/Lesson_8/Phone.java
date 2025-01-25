package Lesson_8;

public class Phone {
    static int countOfSells;

    String marka;
    String address;

    public Phone(String marka, String address) {
        this.marka = marka;
        this.address = address;

        countOfSells++;
    }

    public void calculate() {
        System.out.println(this.marka + this.address);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "marka='" + marka + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
