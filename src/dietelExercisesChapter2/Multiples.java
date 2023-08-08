package dietelExercisesChapter2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1 ");
        int number1 = input.nextInt();
        System.out.println("Enter number2");
        int number2 = input.nextInt();
        int tripled = number1 * number1 * number1;
        int doubled = number2 * number2;
        if(doubled % tripled == 0){
            System.out.println(number1 + " is a multiple of " + number2);
        }
        else System.out.println(number1 + " is not multiple of " + number2);
    }
}
