import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;

        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            if (n > 0){
                count++;
            } else if(n == 0){
                count++;
                break;
            }
        }

        System.out.println(count);

        // start coding here
    }
}