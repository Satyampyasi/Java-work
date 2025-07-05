package certificate_coding;
import java.util.Scanner;

class Rectangle {
    float length;
    float width;

    public float calculateArea() {
        return length * width;
    }

    public float calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Tester {
    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle();
        Scanner sc = new Scanner(System.in);

        // Take user input
        float length = sc.nextFloat();
        float width = sc.nextFloat();
        rectangle.length = length;
        rectangle.width = width;
        sc.close();

        // Corrected formatting
        System.out.format("Area of the rectangle is %.2f\n", rectangle.calculateArea());
        System.out.format("Perimeter of the rectangle is %.2f\n", rectangle.calculatePerimeter());
    }
}
