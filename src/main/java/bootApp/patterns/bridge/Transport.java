package bootApp.patterns.bridge;

public abstract class Transport {

    protected ApiInterface apiInterface;

    public Transport(final ApiInterface apiInterface) {
        this.apiInterface = apiInterface;
    }

    protected abstract void move();
    protected abstract double getMaxSpeed();

}
