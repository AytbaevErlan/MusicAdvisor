import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        if (userInput.isEmpty()){
            System.out.println("");
            return;
        }
        StringBuilder encoded = new StringBuilder();
        char currentChar = userInput.charAt(0);
        int count = 1;


        for (int i = 1; i < userInput.length(); i++) {
            char nextChar = userInput.charAt(i);
            if (nextChar == currentChar) {
                count++;
            } else {
                encoded.append(currentChar).append(count);
                currentChar = nextChar;
                count = 1;
            }
        }

        encoded.append(currentChar).append(count);

        System.out.println(encoded.toString());
    }
}