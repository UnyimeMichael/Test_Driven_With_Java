package dietelExercisesChapter2;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
     int number = input.nextInt();
     int numberSquared = number * number;
     if (number < numberSquared){
         System.out.println(numberSquared + " is greater than  " + number);
     }
     if (number != numberSquared) {
         System.out.println(number + " is not equal to " + numberSquared);
     }else {
         System.out.println(number + " is equal to " + numberSquared);
     }

    }
}
