package dietelExercisesChapter4;

import java.util.Scanner;

public class sentinelExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a score: ");
        int score = input.nextInt();
        while (score != -1) {
            if (score > 100 || score < 0) {
                System.out.println("Please enter a valid input");
            }
            System.out.println("Enter a score: or enter - 1 to discontinue");
            score = input.nextInt();
        }
    }
}
