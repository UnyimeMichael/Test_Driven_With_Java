package dietelExercisesChapter4;

import java.util.Scanner;

public class Palindrome {


    // TODO: 03/05/2023
    /*
    collect input from user store in a variable
    create 6 variables to store the numbers from firstNumber to sixNumber
    initialize the variable to 0
    the variable you use in storing the userinput use it to get the first number with the modulo operator
    then divide the variable by it self by doing userInput / 10 then pick second number use the userInput to perform the modulo action on the second number
    then divide userinput by 10 perform all action these process for the rest
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 6 digit number");
        int num_p = input.nextInt();
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        int fifthNumber = 0;
        int sixNumber = 0;
        firstNumber = num_p % 10;
        num_p = num_p / 10;
        secondNumber = num_p % 10;
        num_p = num_p / 10;
        thirdNumber = num_p % 10;
        num_p = num_p / 10;
        fourthNumber = num_p % 10;
        num_p = num_p / 10;
        fifthNumber = num_p % 10;
        num_p = num_p / 10;
        sixNumber = num_p % 10;

        if (firstNumber == sixNumber && secondNumber == fifthNumber && thirdNumber == fourthNumber){
            System.out.println("True; It is a palindrome");
        }
        else System.out.println("False; it is not a palindrome");


    }
}
