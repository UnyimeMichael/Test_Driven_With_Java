package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an array of 5 element: ");
        int[] list = new int[5];
        int number;
        for (int index = list.length - 1 ; index >= list[0]; index--){
            System.out.printf("Enter number %d: ", list.length - index);
            number = input.nextInt();
            list[index] = number;
        }
        System.out.println(Arrays.toString(list));
    }
}
