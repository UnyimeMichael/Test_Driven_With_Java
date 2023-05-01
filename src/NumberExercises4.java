import java.util.Scanner;

public class NumberExercises4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int sumTotal = 0;
        int validNumber = 0;
        int averageNumber;
        int counter = 1;
        for ( ; counter != 0; ) {
            int validScore = input.nextInt();
            if (validScore >= 0 && validScore <= 100) {
                sumTotal = sumTotal + validScore;
                validNumber = validNumber + 1;
                counter++;
            }
            if (validScore % 2 == 0){

            }
            if (counter == 6 ){
                break;
            }
        }
        averageNumber = sumTotal / validNumber;
        System.out.println("The sum of valid Scores is : " + sumTotal);
        System.out.println("The Average number is :" + averageNumber);

    }
}
