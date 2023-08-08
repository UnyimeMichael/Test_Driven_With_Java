import java.util.Scanner;

public class NumberExercises1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int sumTotal = 0;
        for (int counter =  1; counter <= 5; counter++) {
            int validScore = input.nextInt();
            if (validScore >= 0 && validScore <= 100) {
                sumTotal = sumTotal + validScore;
            }
        }
        System.out.println("The total number is :" + sumTotal);
    }
}
