package Methods;

import java.util.Scanner;

public class MethodsCalling {
    public  static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        findMaximum(10);
    }
    
    /*
    FIND THE MAXIMUM NUMBER
     */
    public static void findMaximum(int number){
        int maximum = 0;
        for(int i = 1; i <=number; i++){
            System.out.println("enter the number");
            int userNums = input.nextInt();
            if (userNums > maximum)
                maximum = userNums;
        }
        System.out.println(maximum);
    }
    }
