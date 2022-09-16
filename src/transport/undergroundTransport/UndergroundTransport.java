package transport.undergroundTransport;

import transport.Transport;
import transport.necessary.Parking;
import transport.necessary.ServiceStation;

public abstract class UndergroundTransport extends Transport implements ServiceStation, Parking {

    @Override
    public void moving() {
        System.out.println("Underground Transport- can only move on the underground");
    }
}
