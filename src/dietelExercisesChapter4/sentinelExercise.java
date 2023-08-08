package dietelExercisesChapter4;

import java.util.Scanner;

public class sentinelExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a score: ");
        int score = input.nextInt();
        int total = 0;
        while (score != -1) {
            if (score > 100 || score < 0) {
                System.out.println("Please enter a valid input");
            }
            System.out.println("Enter a score: or enter - 1 to discontinue");
            score = input.nextInt();
            total = total + score;

        }
        System.out.printf("The total valid score is %d%n : ", total);
    }
}
