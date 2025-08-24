import java.util.Scanner;

// Rectangle class with method (no constructor) refrrance by method
class Rectangle {
    double length;
    double width;

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Creating object of Rectangle class
        Rectangle rect = new Rectangle();

        // Setting values (no constructor used)
        rect.length = length;
        rect.width = width;

        // Calculating and displaying area
        double area = rect.calculateArea();
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}

