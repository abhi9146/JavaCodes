
// Open/Closed Principle (OCP):

// Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.


// Before applying OCP
class Rectangle {
    double width;
    double height;
}

class AreaCalculator {
    double calculateArea(Rectangle rectangle) {
        return rectangle.width * rectangle.height;
    }
}

// After applying OCP
interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    double width;
    double height;

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class OCP {
    
}