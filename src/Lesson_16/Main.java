package Lesson_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();


        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

        if (b == 0) {
            throw new ArithmeticException("0-a bolme yoxdur");
        }

        System.out.println(5 / 0);


    }
}
