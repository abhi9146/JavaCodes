
// Dependency Inversion Principle (DIP):

// High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details; details should depend on abstractions.

// Without DIP
class LightBulb {
    void turnOn() {
        // Turn on logic
    }
}

class Switch {
    LightBulb bulb;

    Switch(LightBulb bulb) {
        this.bulb = bulb;
    }

    void operate() {
        bulb.turnOn();
    }
}

// With DIP
interface Switchable {
    void turnOn();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        // Turn on logic
    }
}

class Switch {
    Switchable device;

    Switch(Switchable device) {
        this.device = device;
    }

    void operate() {
        device.turnOn();
    }
}

public class DIP {
    
}
