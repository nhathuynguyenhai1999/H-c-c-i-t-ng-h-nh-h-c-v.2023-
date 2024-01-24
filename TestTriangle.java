package Main;
import java.util.Scanner;

import javax.swing.*;

public class TestTriangle extends Shape {
    public void Shape() {
        this.getColor();
    }

    public String toString() {
        return "Color: " + getColor();
    }

    class Triangle extends Shape {
        private double side1;
        private double side2;
        private double side3;

        public Triangle() {
            super();
            side1 = side2 = side3 = 1.0;
        }

        public Triangle(double side1, double side2, double side3, String color) {
            super(color);
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }

        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the side1 of the triangle: ");
            double side1 = scanner.nextDouble();

            System.out.print("Enter the side2 of the triangle: ");
            double side2 = scanner.nextDouble();

            System.out.print("Enter the side3 of the triangle: ");
            double side3 = scanner.nextDouble();

            System.out.print("Enter the color of the triangle: ");
            String color = scanner.nextLine();

            // Tạo đối tượng Triangle
            Triangle triangle = new Triangle(side1, side2, side3, color);

            // Hiển thị thông tin của tam giác
            System.out.println("Triangle Information:");
            System.out.println(triangle);
        }
    }
}