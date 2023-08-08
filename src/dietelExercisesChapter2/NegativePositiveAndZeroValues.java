package dietelExercisesChapter2;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        for (int count = 1; count <=5 ; count++) {
            System.out.println("Enter five numbers");
            number = input.nextInt();
            if (number < 0) System.out.printf("%d is a negative value \n", number);
            if (number == 0) System.out.printf("%d is a zero value\n", number);
            if (number > 0) System.out.printf("%d is a positive value\n", number);
        }



    }
}
