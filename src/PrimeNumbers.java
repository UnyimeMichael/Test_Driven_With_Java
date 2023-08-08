import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int  number = input.nextInt();
        for (int counter = 1; counter < number ; counter++){
            if (number % counter == 0 ) {
                if (counter == 2) {
                }
                System.out.println(number + " is a prime number");
            }
             else {System.out.println(number + " is not prime number");
            }
        }
    }
}
