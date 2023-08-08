import java.util.Scanner;

public class NumberExercises {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumTotal = 0;
        for (int counter =  1; counter <= 5; counter++){
            System.out.println("Enter number");
            int number = input.nextInt();
            sumTotal = sumTotal + number;
        }
        System.out.println("The total number is :" + sumTotal);


    }

}
