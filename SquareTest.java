package Main;

public class SquareTest {
    public static void main(String[] args){
        Square square = new Square();
        square = new Square(4);
        square = new Square(5,"red", true);
        System.out.println(square);
    }
}
