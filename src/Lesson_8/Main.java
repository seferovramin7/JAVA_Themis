package Lesson_8;

import Lesson_11.Human;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     m1();

    }


    public static String m1(){
        m2();
        return "m1";
    }


    public static String m2(){
        m3();
        return "m2";
    }

    public static String m3(){
        return "m3";
    }
}
