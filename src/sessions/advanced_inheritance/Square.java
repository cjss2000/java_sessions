package sessions.advanced_inheritance;

// In an inheritance scnerio a relationship between 2 classes can only be that one class EXTENDS the other
public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Implementing the methods from the base class by overriding their original implementation
    // In this case there is no original implementation as the base class is abstract
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
