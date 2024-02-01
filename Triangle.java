package Main;

public class Triangle {
    public static void CheckTriangle(int side1, int side2, int side3)
            throws IndexOutOfBoundsException{
        if (side1 <= 0 || side2 <= 0 || side3 <= 0
                || (side1 + side2 <= side3) || (side2 + side3 <= side1)
                || (side1 + side3 <= side2)) {
            throw new IndexOutOfBoundsException("Invalid triangle sides:"
                    + side1 + ", " + side2 + ", " + side3);
        }
    }

    public static void checkTriangle(int side1, int side2, int side3)
            throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0
                || (side1 + side2 <= side3) || (side2 + side3 <= side1)
                || (side1 + side3 <= side2)) {
            throw new IllegalTriangleException
                    ("Invalid triangle sides: " + side1 + ", " + side2 + ", " + side3);
        }
    }
    public static void processValidTriangle(int side1, int side2, int side3) {
        System.out.println("Valid triangle sides: " + side1 + ", " + side2 + ", " + side3);
        int perimeter = side1 + side2 + side3;
        System.out.println("Perimeter:" + perimeter);double s = perimeter / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area: " + area);
        //___________________________________//
        if (side1 == side2 && side2 == side3) {
            System.out.println("This is an equilateral triangle.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("This is an isosceles triangle.");
        } else {
            System.out.println("This is a scalene triangle.");
        }
    }
}
