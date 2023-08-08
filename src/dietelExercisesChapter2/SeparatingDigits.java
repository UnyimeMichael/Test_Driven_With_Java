package dietelExercisesChapter2;

import java.util.Scanner;

public class SeparatingDigits{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Set of numbers: ");
        int number = input.nextInt();
        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;
        int fourthDigit = 0;
        int fifthDigit = 0;
        fifthDigit = number % 10;
        number = number / 10;
        fourthDigit = number % 10;
        number = number / 10;
        thirdDigit = number % 10;
        number = number / 10;
        secondDigit = number % 10;
        number = number / 10;
        firstDigit = number % 10;
        System.out.printf("%d%3d%3d%3d%3d%n", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);


    }
}
