package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapeManager {
    class Shape {
        protected double area;

        public Shape(double area) {
            this.area = area;
        }

        public double getArea() {
            return area;
        }

        // Phương thức tính diện tích, mỗi loại hình sẽ cài đặt lại
        public void calculateArea() {
            // Implement in subclasses
        }
    }

    // Lớp con cho hình tròn
    class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            super(0); // Diện tích của hình tròn sẽ được tính trong calculateArea()
            this.radius = radius;
        }

        @Override
        public void calculateArea() {
            area = Math.PI * radius * radius;
        }
    }

    // Define Square class
    class Square extends Shape {
        private double side;

        public Square(double side) {
            super(0);
            this.side = side;
        }

        @Override
        public void calculateArea() {
            area = side * side;
        }
    }

    // Define Rectangle class
    class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            super(0);
            this.length = length;
            this.width = width;
        }

        @Override
        public void calculateArea() {
            area = length * width;
        }
    }

    private ArrayList<Shape> shapes = new ArrayList<>();
// private: Đây là từ khóa chỉ định mức độ truy cập của biến shapes.
// Trong trường hợp này, biến này chỉ có thể truy cập được từ bên trong cùng một lớp.
//
//ArrayList<Shape>: Đây là kiểu dữ liệu của biến shapes.
// Đây là một ArrayList (một cấu trúc dữ liệu trong Java) chứa các đối tượng thuộc lớp Shape. Cụ thể, Shape có thể là một interface hoặc lớp cha chung cho các lớp hình học khác nhau (ví dụ: hình tròn, hình vuông).
//
//shapes: Đây là tên của biến.
// Trong trường hợp này, nó là một ArrayList chứa các đối tượng hình học.
//
//= new ArrayList<>(): Đây là cách tạo một đối tượng ArrayList mới và gán cho biến shapes. Điều này tạo ra một ArrayList rỗng, sẵn sàng để thêm các đối tượng hình học vào sau này.
//
//Tóm lại, đoạn mã này đang tạo ra một biến shapes kiểu ArrayList chứa các đối tượng thuộc lớp Shape, và biến này chỉ có thể truy cập được từ bên trong cùng một lớp.
public ShapeManager() {
    shapes = new ArrayList<>();
}
    public void addShape(Shape shape) {
        shapes.add(shape);
        shape.calculateArea();
    }

    public void removeShape(int index) {
        if (index >= 0 && index < shapes.size()) {
            shapes.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    public void displayShapes() {
        System.out.println("List of Shapes:");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println("Shape " + (i + 1) + ": Area = " + shapes.get(i).getArea());
        }
    }

    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();

        shapeManager.addShape(shapeManager.new Circle(5));
        shapeManager.addShape(shapeManager.new Square(4));
        shapeManager.addShape(shapeManager.new Rectangle(3, 6));

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add a shape");
            System.out.println("2. Remove a shape");
            System.out.println("3. Display shapes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Circle");
                    System.out.println("2. Square");
                    System.out.println("3. Rectangle");
                    System.out.print("Enter the type of shape: ");
                    int shapeType = scanner.nextInt();
                    switch (shapeType) {
                        case 1:
                            System.out.print("Enter radius: ");
                            double radius = scanner.nextDouble();
                            shapeManager.addShape(shapeManager.new Circle(radius));
                            break;
                        case 2:
                            System.out.print("Enter side length: ");
                            double side = scanner.nextDouble();
                            shapeManager.addShape(shapeManager.new Square(side));
                            break;
                        case 3:
                            System.out.print("Enter length: ");
                            double length = scanner.nextDouble();
                            System.out.print("Enter width: ");
                            double width = scanner.nextDouble();
                            shapeManager.addShape(shapeManager.new Rectangle(length, width));
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                case 2:
                    System.out.print("Enter index to remove: ");
                    int index = scanner.nextInt();
                    shapeManager.removeShape(index - 1);
                    break;
                case 3:
                    shapeManager.displayShapes();
                    break;
                case 4:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        scanner.close();
    }
}
