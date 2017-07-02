package bootApp.patterns.bridge;

public class Client {

    public static void main(String... args) {
        Transport[] cars = new Transport[]{
                new Car(new SecretService1()),
                new Car(new SecretService2())};
        for (Transport car : cars) {
            car.move();
        }

    }


}
