package shapeManagementSystem;

import java.util.Scanner;

interface Shape {
    
    double getArea();
    double getPerimeter();
    String getColor();
    void setColor(String color);
    boolean isFilled();
    void setFilled(boolean filled);
    String toString();
}


class Circle implements Shape {

    protected double radius = 1.0;
    protected String color = "red";
    protected boolean filled = true;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[Shape[color=" + color + ", filled=" + filled + "], radius=" + radius + "]";
    }
}



class Rectangle implements Shape {

    protected double width = 1.0;
    protected double length = 1.0;
    protected String color = "red";
    protected boolean filled = true;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle[Shape[color=" + color + ", filled=" + filled + "], width=" + width + ", length=" + length + "]";
    }
}



class Square extends Rectangle {

    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}



public class ShapeManagementSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println("---- Shape Management System ----");
            System.out.println("1. Create Circle");
            System.out.println("2. Create Rectangle");
            System.out.println("3. Create Square");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter radius: ");
                    double r = scanner.nextDouble();

                    Circle circle = new Circle(r, "red", true);

                    System.out.println(circle.toString());
                    System.out.println("Area: " + circle.getArea());
                    System.out.println("Perimeter: " + circle.getPerimeter());

                    break;

                case 2:

                    System.out.print("Enter width: ");
                    double w = scanner.nextDouble();

                    System.out.print("Enter length: ");
                    double l = scanner.nextDouble();

                    Rectangle rectangle = new Rectangle(w, l, "blue", true);

                    System.out.println(rectangle.toString());
                    System.out.println("Area: " + rectangle.getArea());
                    System.out.println("Perimeter: " + rectangle.getPerimeter());

                    break;

                case 3:

                    System.out.print("Enter side: ");
                    double s = scanner.nextDouble();

                    Square square = new Square(s, "green", true);

                    System.out.println(square.toString());
                    System.out.println("Area: " + square.getArea());
                    System.out.println("Perimeter: " + square.getPerimeter());

                    break;

                case 4:

                    System.out.println("Exiting program...");
                    break;

                default:

                    System.out.println("Invalid choice! Try again.");
            }

            System.out.println();

        } while (choice != 4);

        scanner.close();
    }
}