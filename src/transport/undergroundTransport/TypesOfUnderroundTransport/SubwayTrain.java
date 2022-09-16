package transport.undergroundTransport.TypesOfUnderroundTransport;


import transport.necessary.Rails;
import transport.undergroundTransport.UndergroundTransport;

public class SubwayTrain extends UndergroundTransport implements Rails {

    @Override
    public void refueling() {
        System.out.println("For movement, refueling is not needed");
    }

    @Override
    public void carWash() {
        System.out.println("Possibility to wash the bus at at the Subway train depot");
    }

    @Override
    public void moving() {

        System.out.println("Subway train - can only move on underground on a specific route");


    }

    @Override
    public void repair() {
        System.out.println("Possibility to repair the Subway train at the service station in the depot");

    }

    @Override
    public void parking() {
        System.out.println("Can only park at the Subway train depot");

    }

    @Override
    public void MoveOnlyRails() {
        System.out.println("Moves only on rails");
    }
}
