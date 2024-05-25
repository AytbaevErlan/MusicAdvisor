import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String shape = scanner.next();

        double area = 0.0;

        switch (shape){
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                area = calculateTriangleArea(a, b, c);
                break;
            case "rectangle":
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                area = calculateRectangleArea(length, width);
                break;
            case "circle":
                double radius = scanner.nextDouble();
                area = calculateCircleArea(radius);
                break;
            default:
                System.out.println("Invalid shape type");
                return;
        }


        System.out.println(area);
    }
    // Method to calculate the area of a triangle using Heron's formula
    private static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Method to calculate the area of a rectangle
    private static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    private static double calculateCircleArea(double radius) {
        final double PI = 3.14;
        return PI * radius * radius;
    }

}
