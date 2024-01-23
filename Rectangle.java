package Main;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(double width, double length, String color, boolean filled) {
//        super(color, filled);       // super là 1 từ khóa
//        super();
        this.width = width;
        this.length = length;
        this.setColor(color);
        this.setFilled(filled);

    }


    public Rectangle(int width, int length) {

    }

    public Rectangle() {

    }

    public Rectangle(double side) {
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    public String toString() {
        return "A rectangle with width = " + width + " and length " +
                length + "which is subclass of" + super.toString();
    }
}
