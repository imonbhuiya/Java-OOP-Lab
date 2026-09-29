package org.coredemo.interfaces;

// --- Interfaces ---

interface Chargeable {
    void charge();
}

interface Connectable {
    void connect();
}

// --- Implementation Class ---

class SmartPhone implements Chargeable, Connectable {

    @Override
    public void charge() {
        System.out.println("Smartphone is charging...");
    }

    @Override
    public void connect() {
        System.out.println("Smartphone is connecting to the network...");
    }
}

// --- Main Demo Class ---

public class SmartDeviceDemo {
    public static void main(String[] args) {
        // Create an instance of SmartPhone
        SmartPhone myPhone = new SmartPhone();


        // Call the implemented methods
        myPhone.charge();
        myPhone.connect();
    }
}
