package transport.groundTransport.TypesOfGroundTransport;

import transport.groundTransport.GroundTransport;
import transport.necessary.Rails;


public class Train extends GroundTransport implements  Rails {
    @Override
    public void refueling() {
        System.out.println("For movement, it can be charged at the gas station train Depot");
    }

    @Override
    public void carWash() {
        System.out.println("Possibility to wash the bus at at the train depot");
    }

    @Override
    public void moving() {

        System.out.println("Train - can only move on land on a specific route");


    }

    @Override
    public void repair() {
        System.out.println("Possibility to repair the train at the service station in the depot");

    }

    @Override
    public void parking() {
        System.out.println("Can only park at the train depot");

    }

    @Override
    public void MoveOnlyRails () {
        System.out.println("Moves only on rails");
    }
}
