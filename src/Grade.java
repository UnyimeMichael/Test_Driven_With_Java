import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many student takes the Test: ");
        int student = input.nextInt();
//        int number = 0;
        for (int number = 0; number != student; number++) {
//        while (number != student){
            System.out.println("enter the student grade: ");
            int studentGrade = input.nextInt();


            if (studentGrade >= 90) {
                System.out.println("A");
            } else if (studentGrade >= 80) {
                System.out.println("B");
            } else if (studentGrade >= 70) {
                System.out.println("C");
            } else if (studentGrade >= 60) {
                System.out.println("D");
            } else
                System.out.println("F");
//            number++;
        }
    }



}
