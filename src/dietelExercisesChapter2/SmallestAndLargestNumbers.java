package dietelExercisesChapter2;

import java.util.Scanner;

public class SmallestAndLargestNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number1");
        int number1 = userInput.nextInt();
        System.out.println("Enter number2");
        int number2 = userInput.nextInt();
        System.out.println("Enter number3");
        int number3 = userInput.nextInt();
        int sum = number1 + number2 + number3;
        int average = (number1 + number2 + number3)/ 3;
        int product = number1 * number2 * number3;
        int smallest = 0;
        int largest = 0;
        if (number1 < number2 && number1 < number3){
            smallest = number1;
        }
        if (number2 < number1 && number2 < number3){
            smallest = number2;
        }
        if (number3 < number1 && number3 < number2) {
            smallest = number3;
        }
        if (number1 > number2 && number1 > number3){
            largest = number1;
        }
        if (number2 > number1 && number2 > number3){
            largest = number2;
        }
        if (number3 > number1 && number3 > number2){
            largest = number3;
        }
        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The average of the numbers is " + average);
        System.out.println("The product of the numbers is " + product);
        System.out.println("The Smallest number is " + smallest);
        System.out.println("The largest number is " + largest);
    }
}
