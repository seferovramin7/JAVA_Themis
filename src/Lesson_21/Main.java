package Lesson_21;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LocalDateTime start = LocalDateTime.now();


//        String input = "madam";
//        String reversed = new StringBuilder(input).reverse().toString();
//        System.out.println(input.equals(reversed)); // Output: true


        String salam = "a man a plan a canal panama";
        salam = salam.replaceAll(" ", "");
        String sb = new StringBuilder(salam).reverse().toString();
        if (sb.equals(salam)) {
            System.out.println("Palindrome");
        }

        LocalDateTime end = LocalDateTime.now();


        System.out.println(Duration.between(start, end));

    }
}
