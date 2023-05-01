package dietelExercisesChapter2;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        int divide = number / 3;
        if (number % 3 == 0){
            System.out.println(divide);
            System.out.println(number + " is divisible by 3");
        }
        else {
            System.out.println(divide);
            System.out.println(number + " is not divisible by 3");
        }
    }
}
