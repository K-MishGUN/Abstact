package transport.groundTransport;
import transport.Transport;
import transport.necessary.GasStation;
import transport.necessary.Parking;
import transport.necessary.ServiceStation;


public abstract class GroundTransport extends Transport implements GasStation, ServiceStation, Parking {
    @Override
    public void moving() {
        System.out.println("Ground Transport- can only move on the ground");
    }


}
