package transport.groundTransport.TypesOfGroundTransport;

import transport.groundTransport.GroundTransport;
import transport.necessary.Road;

public class Bus extends GroundTransport implements  Road {
    @Override
    public void refueling() {
        System.out.println("For movement, it can be refuel at the gas station bus Depot");
    }

    @Override
    public void carWash() {
        System.out.println("Possibility to wash the bus at at the bus depot");
    }

    @Override
    public void moving() {

        System.out.println("Bus - can only move on land on a specific route");


    }

    @Override
    public void repair() {
        System.out.println("Possibility to repair the bus at the service station in the depot");

    }

    @Override
    public void parking() {
        System.out.println("Can only park at the bus depot");

    }

    @Override
    public void MoveOnlyRoad() {
        System.out.println("Moves only on roads");
    }
}
