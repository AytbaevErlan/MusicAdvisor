import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isDivByThreeAndFive(num)) {
            System.out.println("FizzBuzz");
        } else if (isDivByThree(num)) {
            System.out.println("Fizz");
        } else if (isDivByFive(num)) {
            System.out.println("Buzz");
        } else {
            System.out.println("None");
        }

        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
    }
    // Function to check if the number is divisible by both 3 and 5
    public static boolean isDivByThreeAndFive(int num) {
        return num % 3 == 0 && num % 5 == 0;
    }

    // Function to check if the number is divisible by 3
    public static boolean isDivByThree(int num) {
        return num % 3 == 0;
    }

    // Function to check if the number is divisible by 5
    public static boolean isDivByFive(int num) {
        return num % 5 == 0;
    }
}