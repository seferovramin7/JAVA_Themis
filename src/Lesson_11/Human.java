package Lesson_11;

import java.util.Arrays;

public class Human {
    String name;
    private int age;
    private String address;
    private Computer computer;
    private Human[] friends;
    private int totalHumanCount;


    public Human(String name, int age, String address, Computer computer, Human[] friends) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.computer = computer;
        this.friends = friends;

        totalHumanCount++;
    }

    public Human() {
    }

    public Human(String name, int age, String address, Computer computer) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.computer = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Human[] getFriends() {
        return friends;
    }

    public void setFriends(Human[] friends) {
        this.friends = friends;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalHumanCount() {
        return totalHumanCount;
    }

    public void setTotalHumanCount(int totalHumanCount) {
        this.totalHumanCount = totalHumanCount;
    }

    public int calculate(int a, int b) {
        return a + b;
    }


    @Override
    public String toString() {
        return "Lesson_11.Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", computer=" + computer +
                ", friends=" + Arrays.toString(friends) +
                '}';
    }
}
