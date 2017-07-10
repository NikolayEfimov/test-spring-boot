package bootApp.multithread.raceConditions;

import java.security.SecureRandom;

public class Launcher {

    public static void main(String... args) {

        Thread thread1 = new CounterThread("first");
        Thread thread2 = new CounterThread("second");


        thread1.start();
    }

    static class CounterThread extends Thread{
        Counter counter = new Counter();

        public CounterThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            SecureRandom random = new SecureRandom();
            int randInt = random.nextInt(10);
            counter.add(randInt);
        }
    }
}
