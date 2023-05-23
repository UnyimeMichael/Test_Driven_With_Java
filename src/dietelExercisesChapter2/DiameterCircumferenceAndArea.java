package dietelExercisesChapter2;

import java.util.Scanner;

public class DiameterCircumferenceAndArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        int radius = input.nextInt();
        int diameter = 2 * radius;
        double circumference = 2 * 3.14159 * radius;
        double area = 3.14159 * radius * radius;
        System.out.printf("The diameter of the circle is : %d%n" , diameter);
        System.out.printf("The Circumference of the circle is : %f%n ", circumference);
        System.out.printf("The area of the circle is : %f%n ", area);
    }
}
