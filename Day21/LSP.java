
// Liskov Substitution Principle (LSP):

// Subtypes must be substitutable for their base types without altering the correctness of the program.

// Violation of LSP
class Bird {
    void fly() {
        // Bird flying logic
    }
}

class Penguin extends Bird {
    // Cannot fly, violates LSP
}

// Adhering to LSP
interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        // Bird flying logic
    }
}

class Penguin implements Swimable {
    @Override
    public void swim() {
        // Penguin swimming logic
    }
}
public class LSP {
    
}
