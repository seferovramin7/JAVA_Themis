package Lesson_22;

import java.util.ArrayList;
import java.util.HashMap;

// Generic class with one type parameter
class Box<T> {
    // T is the type parameter
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}


public class Main {


    public static void main(String[] args) {


        ArrayList<String> pinCodes = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();


        HashMap<String, String> citizen = new HashMap<>();
        citizen.put("7YTY44F", "Alex");
        citizen.put("7YTY44A", "Alex");

    }
}

