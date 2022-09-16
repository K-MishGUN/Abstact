import transport.groundTransport.TypesOfGroundTransport.Bus;
import transport.groundTransport.TypesOfGroundTransport.Car;


public class Main {
    public static void main(String[] args) {

        Car Car = new Car();
        Car.refueling();
        Car.moving();
        Car.carWash();

        Bus bus = new Bus();
        bus.moving();

    }
}
