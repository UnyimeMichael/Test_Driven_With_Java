package dietelExercisesChapter2;

import java.util.Scanner;

public class ArithmeticSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1");
        int number1 = input.nextInt();
        int i = 1;
        int numberOfCount = 2;
        int sum = 0;
        int diff = 0;
        int number2;
        int squareOfNumber1 = 0;
        int squareOfNumber2 = 0;

        while (i < numberOfCount) {
            System.out.println("Enter number2");
            number2 = input.nextInt();
            squareOfNumber1 = number1 * number1;
            squareOfNumber2 = number2 * number2;
            sum = (number1 * number1) + (number2 * number2);
            diff = (number1 * number1) - (number2 * number2);
            i++;
            if (squareOfNumber1 > squareOfNumber2){
               diff = squareOfNumber1 - squareOfNumber2;
            } else if (squareOfNumber2 > squareOfNumber1) {
                diff = squareOfNumber2 - squareOfNumber1;
            }
        }
        System.out.println(squareOfNumber1);
        System.out.println(squareOfNumber2);
        System.out.println(sum);
        System.out.println(diff);
    }
}