package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementArrayMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] element = new int[5];
        int number;
        for (int index = 0; index < element.length; index++) {
            System.out.println("Enter an array of numbers: ");
            number = input.nextInt();
            element[index] = number;
        }
        checkLargestElement(element);
    }
    public static void checkLargestElement(int[] array){
        int largestElement = 0;
        for (int index = 0; index < array.length; index++){
            if (index == 0) largestElement = array[index];
            else if (largestElement < array[index]) largestElement = array[index];
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("The largest number in the array of numbers is : %d%n", largestElement);

    }


}
