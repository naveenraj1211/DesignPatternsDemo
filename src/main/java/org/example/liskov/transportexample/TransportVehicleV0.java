package org.example.liskov.transportexample;

public abstract class TransportVehicleV0 {

    String name;
    double speed;

    abstract void startEngine();
    abstract void startMoving();
    abstract void stopMoving();
}
