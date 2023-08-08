package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an array of numbers: ");
        int[] element = new int[5];
        int largestElement = 0;
        int number;
        for (int index = 0; index < element.length; index++ ) {
            number = input.nextInt();
            element[index] = number;
            if(index == 0) largestElement = number;
            else if (largestElement < element[index]) largestElement = element[index];
        }
        System.out.println(Arrays.toString(element));
        System.out.printf("The largest number in the array of numbers is : %d%n", largestElement);
//        System.out.println((element[0]));
    }
}


