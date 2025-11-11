import java.util.Scanner;

abstract class Shape {
    int dim1, dim2;

    Shape(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void printArea() {
        double area = dim1 * dim2;
        System.out.println("Area of Rectangle = " + area);
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle = " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0);
    }

    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle = " + area);
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dimensions of the rectangle (length and breadth): ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Shape rectangle = new Rectangle(length, breadth);

        System.out.print("Enter the dimensions of the triangle (base and height): ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        Shape triangle = new Triangle(base, height);

        System.out.print("Enter the dimension of the circle (radius): ");
        int radius = sc.nextInt();
        Shape circle = new Circle(radius);

        System.out.println();
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();

        sc.close();
    }
}
