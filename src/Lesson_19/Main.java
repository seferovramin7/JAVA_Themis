package Lesson_19;



class Countdown implements Runnable {
    private String name;

    public Countdown(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println(name + " - Countdown: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted.");
            }
        }
        System.out.println(name + " - Finished!");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Countdown("Thread 1"));
        Thread t2 = new Thread(new Countdown("Thread 2"));

        t1.start();
        t2.start();
    }
}


