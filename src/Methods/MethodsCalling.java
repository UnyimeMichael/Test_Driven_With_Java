package Methods;

import java.util.Scanner;

public class MethodsCalling {
    public  static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        findMaximum(5);
        int maximum = findMaximum(5);
        System.out.printf("The maximum number is %d%n", maximum);
    }
    
    /*
    FIND THE MAXIMUM NUMBER
     */
    public static int findMaximum(int number){
        int maximum = 0;
        for(int i = 1; i <=number; i++){
            System.out.printf("enter the number %d:%n ", i);
            int userNums = input.nextInt();
            if (userNums > maximum)
                maximum = userNums;
        }
        return maximum;
    }
    }
