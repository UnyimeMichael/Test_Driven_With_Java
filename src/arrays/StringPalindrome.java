package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String[] arrayWord = new String[1];
        String word;
        String wordComparison;
        for (int index = arrayWord.length-1 ; index < arrayWord.length ; index++){
            word = input.nextLine();
            arrayWord[index] = word;
            wordComparison = arrayWord[index];

        }
        System.out.println(Arrays.toString(arrayWord));

    }
}
