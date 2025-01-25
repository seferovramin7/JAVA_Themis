package Lesson_25;

public class Student implements Comparable<Student> {
    int id;
    String name;
    String surname;

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id; // Natural order by ID
    }

}

