package exercise1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle {
    // ATTRIBUTES LIST
    private double height;
    private double width;

    //CONSTRUCTORS LIST
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // STATIC METHODS LIST
    public static void printRectangle(Rectangle rectangle) {
        System.out.println("area = " + rectangle.calculateArea() + " cm²");
        System.out.println("perimeter = " + rectangle.calculatePerimeter() + " cm");
    }

    public static void printTwoRectangle(Rectangle rectangle1, Rectangle rectangle2) {
        System.out.println("--- RECTANGLE 1 ---");
        printRectangle(rectangle1);
        System.out.println("--- RECTANGLE 2 ---");
        printRectangle(rectangle2);
        System.out.println("-------------------");
        System.out.println("AREAS SUM = " + (rectangle1.calculateArea() + rectangle2.calculateArea()) + " cm²");
        System.out.println("PERIMETERS SUM = " + (rectangle1.calculatePerimeter() + rectangle2.calculatePerimeter()) + " cm");
    }

    //GETTERS LIST
    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public String getRectangleData() {
        return "height = " + this.height + " cm / width = " + this.width + " cm";
    }

    // NOT-STATICS METHODS LIST
    private double calculatePerimeter() {
        return new BigDecimal(Double.toString((height + this.width) * 2)).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private double calculateArea() {
        return new BigDecimal(Double.toString(this.height * this.width)).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String toString() {
        return "height=" + height + ", width=" + width;
    }
}
