import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gravity = 9.8;
        double pDensity = scanner.nextDouble();
        double height = scanner.nextDouble();

        double answer = gravity * pDensity * height;

        System.out.println(answer);
    }
}