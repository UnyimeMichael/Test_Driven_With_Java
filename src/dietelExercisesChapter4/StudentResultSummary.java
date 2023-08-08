package dietelExercisesChapter4;

import java.util.Scanner;

public class StudentResultSummary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass = 0;
        int fail = 0;
        int count = 1;
        int result = 1;
        while (count != 10){
            System.out.println("Enter Result(pass = 1 and fail = 2) : ");
            if(result <= 10) {
                result = input.nextInt();
                if (result == 1) {
                    pass = pass + 1;
                    result += 1;
                }
                else if (result == 2) {
                    fail = fail + 1;
                    result += 1;
                }
                else System.out.println("Invalid Entry");
            }
            count += 1;
        }
        System.out.printf("Passed : %d%nFailed : %d%n ", pass , fail);
        if (pass > 8){
            System.out.println("Bonus to the Instructor!!!");
        }
    }

}