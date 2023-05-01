import java.util.Scanner;

public class NumberExercises2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int sumTotal = 0;
        int validNumber = 0;
        int averageNumber ;
        for (int counter =  1; counter <= 5; counter++) {
            int validScore = input.nextInt();
            if (validScore >= 0 && validScore <= 100) {
                sumTotal = sumTotal + validScore;
                validNumber = validNumber + 1;
            }
        }
        averageNumber = sumTotal/validNumber;
        System.out.println("The Average number is :" + averageNumber);

    }
}