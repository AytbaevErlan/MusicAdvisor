import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        String word = scaner.nextLine();
        System.out.println(minInsertionsToEuphonious(word));
    }

    public  static int minInsertionsToEuphonious(String word){
        int insertion = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        String vowels = "aeiouy";

        for( int i = 0; i < word.length(); i++){
            char currentChar = word.charAt(i);
            if(vowels.indexOf(currentChar) != -1){
                vowelCount++;
                consonantCount = 0;
                if (vowelCount == 3){
                    insertion++;
                    vowelCount = 1;
                }
            } else{
                consonantCount++;
                vowelCount = 0;
                if (consonantCount == 3){
                    insertion++;
                    consonantCount = 1;
                }

            }
        }

        return insertion;
    }
}