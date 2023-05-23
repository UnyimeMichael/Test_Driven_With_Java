package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practices {
    public static void main(String[] args) {
//        int[] number = new int[4];
//        number[0] = 40;
//        number[1] = 35;
//        number[2] = 20;
//        number[3] = 10;
//        System.out.println(Arrays.toString(number));
//        System.out.println(number.length);
//
//        int[] number1 = {10,20,30,40,50,60};
//        System.out.println(Arrays.toString(number1));
//
//        String[] names = {"hey","mey","lay","ley" };
//        System.out.println((Arrays.toString(names )));
//        System.out.println(names.length);
//
//        String[] name = {"mike","john","kemi","bola"};
//        for (int i = name.length - 1 ; i >= 0; i-- ){
//            System.out.println(name[i]);
//        }
//        for (String namee : name){
//            System.out.println(namee);
//        }
//
//
//        int[] array = new int[10];
//        System.out.printf("%s%8s%n", "Index", "Value");
//        for(int counter = 0; counter < array.length; counter++){
//            System.out.printf("%3d%8d%n", counter, array[counter]);
//        }
//
//        int arrays[] = {23, 32, 43, 45, 37, 49, 46, 27, 38, 28};
//        System.out.printf("%s%8s%n", "index", "values");
//        for (int count = 0; count < arrays.length ; count++){
//            System.out.printf("%3d%8d%n", count, arrays[count]);
//        }
//
//        int c[] = new int[15];
//        for (int d = 0; d < c.length; d++) {
//            c[d] = d + 1;
//            System.out.printf("%d %n", c[d]);
//        }
//            System.out.println(Arrays.toString(c));
//
//        int[] evenNumber = new int[10];
//        System.out.printf("%s%8s%n", "Index", "Values");
//        for(int index = 0 ; index < evenNumber.length; index++){
//            evenNumber[index] = 2 + 2 * index;
//            System.out.printf("%3d%8d%n", index, evenNumber[index]);
//        }
//
        int[] gradeScores = new int[10];
        int totalScores = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Grade Scores: ");
        for (int index = 0; index < gradeScores.length ; index++){
            gradeScores[index] = input.nextInt();
            if (gradeScores[index] >= 0 && gradeScores[index] <= 100) {
                totalScores = totalScores + gradeScores[index];
            }
            else {
                System.out.println("please Enter valid Score between 0 and 100");
            }
        }
        System.out.printf("The total grade score %d%n ", totalScores);
    }
}
