package oops;

class Shape {
    // Method to calculate area
    public void calculateArea() {
        System.out.println("Calculating area of a shape");
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overridden method to calculate area for a circle
    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overridden method to calculate area for a rectangle
    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }
}

public class PolyEx {
    public static void main(String[] args) {
        // Creating objects of child classes
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Demonstrating runtime polymorphism
        Shape shape1 = circle;
        Shape shape2 = rectangle;

        // Calling the overridden method
        shape1.calculateArea(); // Calls the calculateArea() method of Circle
        shape2.calculateArea(); // Calls the calculateArea() method of Rectangle

    }
}