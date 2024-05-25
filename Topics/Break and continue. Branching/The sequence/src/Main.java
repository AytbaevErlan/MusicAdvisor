import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int t = n;
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++){
                if (t == 0){
                    break;
                } else {
                    System.out.print(i + " ");
                    t--;
                }
            }
        }
    }
}