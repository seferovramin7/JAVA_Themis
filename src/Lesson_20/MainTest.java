package Lesson_20;

public class MainTest {
    public static void main(String[] args) throws Exception {
//        System.out.println("1. Testing Thread Synchronization:");
//        Counter counter = new Counter();
//        Thread t1 = new Thread(counter::increment);
//        Thread t2 = new Thread(counter::increment);
//        Thread t3 = new Thread(counter::increment);
//        Thread t4 = new Thread(counter::increment);
//        Thread t5 = new Thread(counter::increment);
//        Thread t6 = new Thread(counter::increment);
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();
//        t1.join();
//        t2.join();
//        t3.join();
//        t4.join();
//        t5.join();
//        t6.join();
//        System.out.println("Final Count: " + counter.getCount());


//        System.out.println("\n2. Testing Inter-Thread Communication:");
//        SharedResource shared = new SharedResource();
//        new Thread(() -> shared.produce(100)).start();
//        new Thread(shared::consume).start();
//
//        System.out.println("\n3. Testing Thread Pool:");
//        ThreadPoolExample.main(args);
//
//        System.out.println("\n4. Testing Callable and Future:");
//        CallableExample.main(args);
////
        System.out.println("\n5. Testing Deadlock Prevention:");
        DeadlockExample deadlockExample = new DeadlockExample();
        new Thread(deadlockExample::task).start();
    }
}

