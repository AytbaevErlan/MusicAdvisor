import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = scanner.nextInt();

        int divisable = 4;
        int max = 0;

        while(scanner.hasNext()){
            int n = scanner.nextInt();
            if (n % divisable == 0 && n > max){
                max = n;
            }
        }
        System.out.println(max);
        // start coding here
    }
}