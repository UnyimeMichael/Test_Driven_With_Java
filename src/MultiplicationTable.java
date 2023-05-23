import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = input.nextInt();
//        int multiply = 0;
//        System.out.printf("Multiplication table of %d is :%n", number);
//        for (int i = 1 ; i <= 12; i++) {
//            multiply = number * i;
//            System.out.printf("%d%2s%3d%2s%4d%n", number , "*", i, "=", multiply);
//        }


        int m;
        for (int j = 1; j <= 12; j++){
            for (int k = 1; k <= 12 ; k++){
                m = j * k;
                System.out.printf("%d%2s%3d%2s%4d%20%", j , "*", k , "=", m);
            }
            System.out.println();
        }
    }
}
