package exercise1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 5);
        Rectangle rectangle2 = new Rectangle(4, 2);


        Rectangle.printRectangle(rectangle1);
        System.out.println("--- RECTANGLE 2 (" + rectangle2.toString() + ")");
        Rectangle.printRectangle(rectangle2);
        System.out.println("--- RECTANGLE 1 (" + rectangle1.toString() + "), RECTANGLE 2 (" + rectangle2.toString() + ")");
        Rectangle.printTwoRectangles(rectangle1, rectangle2);
    }
}
