package Main;

public class Square extends Rectangle {
    private double side;
    public Square() {
        setSide(side);
    }

    public Square(int i, String red, boolean b) {
    }

    public Square(int i) {
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * 4;
    }
    public double getPerimeter() {
        return side * side;
    }
}
