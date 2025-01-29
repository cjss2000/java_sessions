package sessions.advanced_inheritance;

// An abstract class defines a SHARED but very general behavior that can be implemented by multiple classes
// And abstract methods are methods that are declared (AS MUST HAVE FOR ALL SUBCLASS) but not implemented
public abstract class Shape {

    public abstract double getArea();

    public abstract double getPerimeter();

}
