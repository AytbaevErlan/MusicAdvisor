import java.util.Scanner;

// Define the Circle class here
class Circle {
    // Declare the properties of the Circle class here
    int area;
    int radius;

    /* Define the default and parameterized constructors here. The constructors should initialize the 
       'radius' property with the given or default value and 'area' property with the value calculated as πr^2 
        rounded off to the nearest whole number. */
    public Circle(){
        radius = 1;
    }

    public Circle(int radius){
        this.radius = radius;

    }

    // Getters for the 'radius' and 'area' properties
    public int getRadius() {
        return radius;
        // Your code here
    }

    public int getArea() {
        return area;
        // Your code here
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // create a Circle object using 'n' if its positive else use the default constructor


        // print the circle's radius and area


    }
}