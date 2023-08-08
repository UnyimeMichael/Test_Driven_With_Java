package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OddPositionsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int[] oddPositions = new int[10];
        int number;
        for (int index = 0; index < oddPositions.length + 1; index++){
            number = input.nextInt();
            oddPositions[index + 1] = number;
        }
        System.out.println(Arrays.toString(oddPositions));
    }
}