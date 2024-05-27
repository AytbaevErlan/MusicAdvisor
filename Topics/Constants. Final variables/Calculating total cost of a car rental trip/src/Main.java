import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kilometers = scanner.nextInt();

        int price = kilometers * 10;

        System.out.println(price);
    }
}