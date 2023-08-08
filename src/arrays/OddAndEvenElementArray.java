package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OddAndEvenElementArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of numbers");
        int[] oddNumbers = new int[10];
        int[] evenNumbers = new int[10];
        int number = 0;
        for (int index = 0 ; index < oddNumbers.length; index++) {
            System.out.printf("Enter number %d: ", index + 1);
            number = input.nextInt();
            if (number % 2 != 0) {
                oddNumbers[index] = number;
            } else evenNumbers[index] = number;
        }
        System.out.println("The even numbers are: " + Arrays.toString(evenNumbers));
        System.out.println("The odd numbers are: " + Arrays.toString(oddNumbers));
    }
}
