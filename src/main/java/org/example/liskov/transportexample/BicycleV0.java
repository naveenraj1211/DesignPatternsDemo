package org.example.liskov.transportexample;

public class BicycleV0 extends TransportVehicleV0 {

    @Override
    void startEngine() {
        // leave empty
        //throw new Exception();
        // print("i do not have a engine")
    }

    @Override
    void startMoving() {

    }

    @Override
    void stopMoving() {

    }
}

