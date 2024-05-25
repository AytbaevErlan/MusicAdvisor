import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int value;
        do {
            value = scanner.nextInt();
            sum += value;
        } while (value != 0);

        System.out.println(sum);
        // start coding here
    }
}
