import java.util.Scanner;

public class Main {

    public static int process(int input) {
       int ans = input * input;
        System.out.println(ans);
        return ans;
    }

    public static float process(float input) {
        int res = Math.round(input);
        System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        try {
            Integer integerInput = Integer.parseInt(input);
            process(integerInput);
        } catch (NumberFormatException e) {
            Float floatInput = Float.parseFloat(input);
            process(floatInput);
        }
    }
}