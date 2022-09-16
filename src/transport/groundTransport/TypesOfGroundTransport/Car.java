package transport.groundTransport.TypesOfGroundTransport;

import transport.groundTransport.GroundTransport;
import transport.necessary.Road;

public class Car extends GroundTransport implements  Road {
    @Override
    public void moving() {
        System.out.println("Car- can only move on the ground in any direction");
    }


    @Override
    public void refueling() {
        System.out.println("For movement, it can only refuel at a gas station");

    }

    @Override
    public void carWash() {
        System.out.println("Possibility to wash the car at all car washes");

    }

    @Override
    public void repair() {
        System.out.println("The ability to fix the car at all service station");
    }

    @Override
    public void parking() {
        System.out.println("Can park anywhere allowed");
    }

    @Override
    public void MoveOnlyRoad() {
        System.out.println("Moves only on roads");
    }
}
