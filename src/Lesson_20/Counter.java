package Lesson_20;

class Counter {
    private int count = 0;

    public void increment()  {
        synchronized (this) {  // Lock this part only
            count++;
            System.out.println("Current count : " + count);
        }
    }

    public int getCount() {
        return count;
    }
}

