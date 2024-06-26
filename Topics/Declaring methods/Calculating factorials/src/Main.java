import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        if(n == 0 || n == 1){
            return 1;
        }

        long ans = 1;
        for (int i = 1; i <= n; i++){
            ans *= i;
        }

        return ans;
        // write your code here
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}