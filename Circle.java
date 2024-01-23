package Main;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(double radius, String color, boolean filled) {
        super(color , filled);
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter() {
        return radius * radius *  Math.PI;
    }
    public double getArea() {
        return 2 * radius * radius *  Math.PI;
    }
    public String toString() {
        return "Circle with radius" + getRadius() + ", which is a subclass of" + super.toString();
    }
}
