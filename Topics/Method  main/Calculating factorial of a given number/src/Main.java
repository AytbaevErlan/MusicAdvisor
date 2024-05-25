import java.util.Scanner; // 3.1 Import necessary library

public class Main { // 3.6 Always use 'Main' as class name

    // 3.0 No method main code here, user write their own

    public static void main(String[] args) {
        // 3.2 Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int factorial = 1;
        if (n == 0 || n == 1) {
            factorial = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
        }

        System.out.println(factorial);

        scanner.close(); // Always close the scanner when done
    }

}