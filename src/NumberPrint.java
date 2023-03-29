//import java.util.Scanner;

import java.util.Scanner;

public class NumberPrint {
    public static void main(String[] args) {

//        for ( int counter = 0 ; counter < 10 ; counter = counter + 1){
//            System.out.println(counter);
//        }

//        int counter = 1;
//                while(counter <= 10){
//                    System.out.println(counter);
//                    counter ++;
//                }
//                counter = 2;
//                while(counter <= 10){
//                    System.out.println(counter);
//                    counter += 2;
//                }
//                counter = 1;
//                while(counter <= 30) {
//                    System.out.println(counter);
//                    counter += 2;
//                }

//        int counter = 0;
//        while (counter <= 50){
//            if(counter % 2 == 1)
//            System.out.println(counter);
//            counter ++;
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number");
//        int number1 = input.nextInt();
//        if (number1 == 5) {
//            System.out.println("number is equal to " + 5);
//        } else if (number1 >= 5) {
//            System.out.println("number is greater than or equal to " + 5);
//        } else {System.out.println("number is less than " + 5);
//        }


//        Scanner input = new Scanner();
//        System.out.println("enter numbers");
//        int userInput = input.nextInt();
//        int numbers =
//
//        if ()
//        int i = 10;
//        while (i>=1){
//            System.out.println(1); i--;
//        }

//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j <= i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        for (int j = 1 ; j <= 10 ; j++){
//            for (int k = 1 ; k <= j ; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int m = 1 ; m <= 10 ; m++){
//            for (int n = 20 ; n >= m ; n--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        }while(i<=5);

        for(int number = 1; number <= 100 ; number++){
            if (number % 3 ==0 && number % 5 == 0){
                System.out.println("fizzbuzz");
            } else if (number % 3 == 0) {
                System.out.println("fizz");
            }  else if (number % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(number);
            }


        }

    }
}