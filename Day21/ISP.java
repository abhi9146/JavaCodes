
// Interface Segregation Principle (ISP):

// A class should not be forced to implement interfaces it does not use.

// Violation of ISP
interface Worker {
    void work();

    void eat();
}

class Engineer implements Worker {
    // Engineer must implement eat() even though it doesn't make sense
}

// Adhering to ISP
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Engineer implements Workable {
    // Engineer only implements work() and is not forced to implement eat()
}
public class ISP {
    
}
