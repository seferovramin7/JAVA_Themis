package Lesson_16;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
    public static void main(String[] args) {


        try {


            File file = new File("src/Lesson_16/example.txt");
            FileReader fr = new FileReader(file);
            System.out.println("Hershey Okay");
        } catch (FileNotFoundException e) {
            System.out.println("File tapilmadi");
        } finally {
            System.out.println("Bu her bir halda ishleyecek");
        }


    }

}
