package dietelExercisesChapter4;

import java.util.Scanner;

public class AsterisksLoop {
    public static void main(String[] args) {

//        int i = 1;
//        while (i <= 5) {
//            int j = 1;
//            while (j < i) {
//                System.out.print(" ");
//                j++;
//            }
//            int k = 5;
//            while (k >= i){
//                System.out.print("*");
//                k--;
//            }
//            System.out.println();
//            i++;
//        }
//
//        int i = 1;
//        while (i <= 5) {
//            int j = 1;
//            while (j < 5) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//
//int count = 1;
//while (count <= 5) {
//    int countTwo = 1;
//    while (countTwo < count) {
//        System.out.print(" ");
//        countTwo++;
//    }
//    int countThree = 5;
//    while (countThree >= count) {
//        System.out.print("*");
//        countThree--;
//    }
//    System.out.println();
//    count++;
//        }

//
//int count = 1;
//while (count <= 10){
//    int count1 = 1;
//    while (count1 < count){
//        System.out.print(" ");
//        count1 = count1 + 2;
//    }
//    int count2 = 5;
//    while(count2 >= count){
//        System.out.print("*");
//        count2--;
//    }
//
//    System.out.println();
//    count = count + 2;
//}
//
//      int count = 1;
//      while (count <= 10){
//          int count1 = 1;
//          while (count1 <= 10) {
//              System.out.print(" * ");
//              count1++;
//          }
//      count++;
//      System.out.println();
//      if (count % 2 == 0) {
//          System.out.print(" ");
//      }
//
//
//      }
//
//      for (int i = 1 ; i <= 100 ; i++) {
//      if (i % 2 == 0) {
//        System.out.println("even " + i);
//      }
//      else System.out.println("odd");
//
//}

        int i = 0;
        int j = 1;
        int f;
        System.out.println(i);
        System.out.println(j);
        for (int k = 1 ; k <= 10 ; k++) {
        f = i + j;
        System.out.println(f);
        i = j;
        j = f;
    }
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter numbers between 0 and 100 : ");
//        int number = input.nextInt();
//        int total = 0;
//        while (number != -20) {
//            if(number >= 0 && number <= 100) {
//                total = total + number;
//                System.out.println("Enter numbers between 0 and 100 :");
//                number = input.nextInt();
//            }
//            else {
//                System.out.println("Invalid number, Please enter numbers between 0 and 100");
//                number = input.nextInt();
//            }
//        }
//        System.out.printf("The sum total of numbers is %d :", total);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers between 0 and 100 : ");
        int number = input.nextInt();
        int total = 0;
        for (;number != -20;) {
            if (number >= 0 && number <= 100) {
                total = total + number;
                System.out.println("Enter numbers between 0 and 100 :");
                number = input.nextInt();
            }
            else {
                System.out.println("Invalid number, Please enter numbers between 0 and 100");
                number = input.nextInt();
            }
        }
        System.out.printf("The sum total of numbers is %d :", total);


    }
    }