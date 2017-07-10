package bootApp.multithread;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadExperiments {

    private static ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

    public static void main(String args[]) {

        System.out.println("main thread start");
        System.out.println("_____________________");
//        firstProcess();
        secondProcess();

        ThreadUtils.printThreadInfo(Thread.currentThread());

        System.out.println("_____________________");
        System.out.println("main thread finish");
    }

    private static void secondProcess() {

        List<Future<Long>> futures = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int n = 100000 * new SecureRandom().nextInt(10);
            System.out.println("n = " + n);
            CallableProcess callableProcess = new CallableProcess(n);
            futures.add(threadPoolExecutor.submit(callableProcess));
        }

        for (Future<Long> result : futures) {
            try {
                Object res = result.get();
                System.out.println("calculation result = " + res);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        threadPoolExecutor.shutdown();


    }

    private static void firstProcess() {
        Runnable process1 = () -> System.out.println("process1 run");
        Thread thread1 = new Thread(process1);
        thread1.start();
    }


}
