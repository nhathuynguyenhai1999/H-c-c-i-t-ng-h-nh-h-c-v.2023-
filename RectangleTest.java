package Main;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle = new Rectangle(14,16);
        rectangle = new Rectangle(14,16, "black", true);
        System.out.println(rectangle.toString());
    }
}
