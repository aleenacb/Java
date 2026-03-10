//import static java.lang.Math.*;
interface Shape{
    double calculateArea();
}
//interface
class Circle implements Shape{
    private double r;
    //Abstract method
    public Circle(double r) {
        this.r = r;
    }
    //implementing abstract method for interface
    public double calculateArea() {
        double pi = 3.14;
        return pi * r * r;
    }
}
//interface
class Rectangle implements Shape{
    private double length;
    private double width;
    //constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //implementing abstract method
    public double calculateArea() {
        return length * width;
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        Shape cir = new Circle(5.0);
        Shape rect = new Rectangle(2.0, 3.5);
        System.out.println("Area of circle: " + cir.calculateArea());
        System.out.println("Area of rectangle: " + rect.calculateArea());
    }
}