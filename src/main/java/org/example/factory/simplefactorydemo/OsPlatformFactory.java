package org.example.factory.simplefactorydemo;

public class OsPlatformFactory {

    /**
     * Simple Factory class
     * 1. Takes arguments
     * 2. create a object using if-else conditions
     * 3. return that object
     */
    Platform createPlatform(String type) {
        if (type.equals("Andriod")) {
            return new AndriodPlatform();
        } else if (type.equals("ios")) {
            return new IosPlatform();
        } else {
            return null;
        }
    }

}
