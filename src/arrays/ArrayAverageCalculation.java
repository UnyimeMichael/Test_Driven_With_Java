package arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayAverageCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        double totalNumber = 0;
        double averageTotalNumber = 0;
        int[] arrayNumber = new int[5];
        for (int index = 0; index < arrayNumber.length; index++) {
            System.out.printf("Enter number %d: ", index + 1);
            try {
                number = input.nextInt();
            }catch (InputMismatchException ime){
                System.out.println("INPUT MISMATCH !!!...Please kindly enter the correct input");
            }
            arrayNumber[index] = number;
            totalNumber = totalNumber + number;
            averageTotalNumber = totalNumber / arrayNumber.length;
        }
        System.out.println(Arrays.toString(arrayNumber));
        System.out.printf("The average of the numbers collected is: %.2f%n", averageTotalNumber);


    }
}
