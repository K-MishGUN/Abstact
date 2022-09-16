package transport.flyingTransport.typesOfFlyingTransport;

import transport.flyingTransport.FlyingTransport;

public class Airplane extends FlyingTransport {

    @Override
    public void refueling() {
        System.out.println("For movement, refueling is not needed");
    }

    @Override
    public void carWash() {
        System.out.println("Possibility to wash the bus at at the airplane airport");
    }

    @Override
    public void moving() {

        System.out.println("Airplane - can only move on sky on a specific route");


    }

    @Override
    public void repair() {
        System.out.println("Possibility to repair the airplane at the service station in the airport");

    }

    @Override
    public void parking() {
        System.out.println("Can only park at the Subway airport");

    }

    @Override
    public void MoveOnlySky () {
        System.out.println("Moves only on sky");
    }
}
