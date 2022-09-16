package transport.flyingTransport;

import transport.Transport;
import transport.necessary.GasStation;
import transport.necessary.Parking;
import transport.necessary.ServiceStation;
import transport.necessary.Sky;

public abstract class FlyingTransport extends Transport implements GasStation, Parking, ServiceStation, Sky {
    @Override
    public void moving() {
        System.out.println("Flying Transport- can only move on the sky");

    }
}
