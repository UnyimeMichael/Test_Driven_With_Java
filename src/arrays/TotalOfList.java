package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TotalOfList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a set og numbers");
        int[] arrayNumber = new int[5];
        int number;
        int sumTotal = 0;
        for (int index = 0 ; index < arrayNumber.length; index++){
            System.out.printf("Enter number %d: ", index + 1);
            number = input.nextInt();
            arrayNumber[index] = number;
            sumTotal = sumTotal + number;
        }
        System.out.println(Arrays.toString(arrayNumber));
        System.out.printf("The running total of the list is : %d", sumTotal);
    }
}
