package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoop {


    public static void main(String[] args) {
//        int[] content = new int[10];
//        for (int index = 0; index < content.length; index++) {
//            content[index] = index + 1;
//        }
//            System.out.println(Arrays.toString(content));
//    }
//
//    public int [] compareArray(int[] arrayObject) {
//        for (int index = 0; index < arrayObject.length ; index++){
//            arrayObject[index] = index + 1;
//        }
//         return arrayObject;

//        String[] names = new String[]{"esther", "kulitech", "vicky", "retna", "oye", "joy", "sultan", "bright"};
//        System.out.println(names.length);
//        System.out.println(names[names.length-1]);
//        System.out.println(Arrays.toString(names));
//
//        int[] count = new int[5];
//        count[0] = 3;
//        count[1] = 4;
//        count[2] = 5;
//        count[3] = 6;
//        count[4] = 8;
//        System.out.println(Arrays.toString(count));
//
//        int[] num = new int[50];
//        for(int index = 0; index < num.length; index++){
//            num[index] = 5;
//        }
//        System.out.println(Arrays.toString(num));

//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter numbers: ");
//        int totalNumber = 0;
//        int[] arrayNumber = new int[5];
//        for(int index = 0; index < arrayNumber.length; index++ ){
//            arrayNumber[index] = input.nextInt();
//            totalNumber = totalNumber + arrayNumber[index];
//        }
//        int[] total = {totalNumber};
//        System.out.println(totalNumber);
//        System.out.println(Arrays.toString(total));
//
//        int[] nums = {5, 6, 7, 8, 9};
//        for (int index = 0; index < nums.length; index++) {
//            System.out.println(nums[index]);
//        }
//
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a set of numbers");
//        int[] number = new int[5];
//        for (int index = 0; index < number.length; index++){
//            int numbers = input.nextInt();


//        try{
//            int[] arr = {2,5,6,7};
//            System.out.println(arr[10]);
//        }catch(ArrayIndexOutOfBoundsException ex){


        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int sum = add(num1, num2, num3);
        System.out.println(sum);

    }
    public static int add(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

}