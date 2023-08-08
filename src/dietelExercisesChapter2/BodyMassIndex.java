package dietelExercisesChapter2;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Weight in Kg: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in meters");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Your Body Mass Index is %f%n", bmi);

    }
}
