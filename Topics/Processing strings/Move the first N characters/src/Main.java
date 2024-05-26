import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int num = scanner.nextInt();

        if(num > word.length()){
            System.out.println(word);
        } else {
            String second = word.substring(0, num);
            String first = word.substring(num, word.length());
            System.out.println(first + second);
        }

    }
}