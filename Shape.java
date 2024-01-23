package Main;

public class Shape {
    private String color = "green";
    private boolean filled = true;              // điền: tô

    public Shape(String color, boolean filled) {
        setFilled(filled);
        setColor(color);
    }

    public Shape() {
        System.out.println("GIO LEN HAM KHOI TAO CUA LOP CHA");
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled() {
        this.filled = filled;
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "A shape of the color of " + getColor() + "and" + (isFilled() ? "filled" : "not filled");
    }
}
