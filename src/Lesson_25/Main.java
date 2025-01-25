package Lesson_25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(12, "Yusif", "Aliyev");
        Student s2 = new Student(5, "Mariam", "Sultanov");
        Student s3 = new Student(20, "Ali", "Teymurlu");
        Student s4 = new Student(25, "Omer", "Rustemov");

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        // Collections.sort(arrayList);

        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name); // Custom order by name
            }
        };

        Comparator<Student> surnameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.surname.compareTo(s2.surname); // Custom order by name
            }
        };

        //    List<Student> students = Arrays.asList(new Student(2, "Alice"), new Student(1, "Bob"));
        Collections.sort(arrayList, surnameComparator);


        for (Student s : arrayList) {
            System.out.println(s);
        }

    }
}
