package bootApp.multithread;

import java.util.concurrent.Callable;

public class CallableProcess implements Callable<Long> {

    private Integer n;


    public CallableProcess(Integer n) {
        this.n = n;
    }

    @Override
    public Long call() throws Exception {
        long start = System.currentTimeMillis();
        System.out.println(Thread.currentThread());
        ThreadUtils.printThreadInfo(Thread.currentThread());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        long finish = System.currentTimeMillis();

        return finish - start;
    }
}
