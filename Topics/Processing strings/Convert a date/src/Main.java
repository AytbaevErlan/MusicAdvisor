import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();

        String[] split = date.split("-");

        String year = split[0];
        String month = split[1];
        String day = split[2];

        String newDate = month + "/" + day + "/" + year;

        System.out.println(newDate);
    }
}