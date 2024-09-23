import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double city1 = scanner.nextDouble();
        double city2 = scanner.nextDouble();

        double answer = city1 / city2;

        System.out.println(answer);

    }
}