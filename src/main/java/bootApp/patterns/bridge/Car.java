package bootApp.patterns.bridge;

public class Car extends Transport {

    private String model;
    private double maxSpeed;

    public Car(ApiInterface apiInterface) {
        super(apiInterface);
    }

    @Override
    protected void move() {
        ApiObject apiObject = new ApiObject();
        apiObject.setName(model);
        apiObject.setValue(String.valueOf(maxSpeed));
        apiInterface.superAction(apiObject);
    }

    @Override
    protected double getMaxSpeed() {
        return maxSpeed;
    }
}
