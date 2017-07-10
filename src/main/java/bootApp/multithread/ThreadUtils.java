package bootApp.multithread;

public class ThreadUtils {

    public static void printThreadInfo(Thread thread) {
        System.out.println("________________________________");
        System.out.println("thread.getName() = " + thread.getName());
        System.out.println("thread.getState() = " + thread.getState());
        System.out.println("thread.getPriority() = " + thread.getPriority());
        System.out.println("thread.isAlive() = " + thread.isAlive());
        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
        System.out.println("________________________________");
    }
}
