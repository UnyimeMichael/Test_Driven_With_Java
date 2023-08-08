package Method;

import java.util.Scanner;

public class Method_Practises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number");
        int number1 = input.nextInt();
        System.out.println("Enter second Number");
        int number2 = input.nextInt();
        System.out.println("Enter third Number");
        int number3 = input.nextInt();
        int ans = compareNumber(number1, number2);
        System.out.printf("The larger number between %d and %d is %d:%n " , number1, number2, ans);
        double average = gradeAverage(number1, number2, number3);
        System.out.printf("The average score between %f , %f and %f is %f:%n " , number1, number2, average);




    }
    public static int compareNumber(int num1, int num2){
        int largerNum;
        if(num1 < num2) largerNum = num2;
        else largerNum = num1;
        return largerNum;
    }

    public static double gradeAverage(double score1, double score2, double score3){
        double sum;
        double average;
            sum = score1 + score2 + score3;
            average = sum / 3;
            return average;
    }
}
