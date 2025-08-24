import java.util.Scanner;

// Rectangle class with method (no constructor)
class Rectangle {
    double length;
    double width;
    void insert(double l, double w) {
        length = l;
        width = w;
    }

    // Method to calculate area
    double calculateArea() {
        System.out.println ("Rectangle area is :"  + length * width);
      return 0;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Creating object of Rectangle class
        Rectangle rect = new Rectangle();

        rect.insert(length, width);
        // Calculating and displaying area
        double area = rect.calculateArea();

        
    }
}