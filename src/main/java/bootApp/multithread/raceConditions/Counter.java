package bootApp.multithread.raceConditions;

public class Counter {

    protected long count;

    public void add(long val) {
        count += val;
    }
}
