import java.util.Scanner;

// Define the Package class with a private member variable 'weight' and a constructor
class Package {
    private double weight;

    public Package(double weight) {
        this.weight = weight;
    }

    // Implement the 'getShippingCost' method to calculate the shipping cost based on the package weight
    public double getShippingCost() {
        double cost;
        if (weight <= 5) {
            cost = 5.0;
        } else {
            cost = 5.0 + (weight - 5) * 1.0;
        }
        // Round up to the nearest whole number
        return Math.ceil(cost);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = scanner.nextDouble();



        Package myPackage = new Package(weight);


        System.out.println(myPackage.getShippingCost());

    }
}