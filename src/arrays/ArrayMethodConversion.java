package arrays;

import com.sun.jdi.IntegerValue;
import dietelExercisesChapter2.IntegerValueOfCharacter;

import java.util.Arrays;

public class ArrayMethodConversion {
    public static void main(String[] args) {
        int[] x = {10, 23, 43, 62, 12};
        for(int index = 0; index < x.length; index++){
            String hold = String.valueOf(x[index]);
            int holdNumb = Integer.parseInt(hold);
//            System.out.print(holdNumb);
            int[] arrNumber = {holdNumb / 10 , holdNumb % 10};
            System.out.print(Arrays.toString(arrNumber));
//            int[] holdNumber = holdNumb % 10;
//            System.out.print(holdNumber);
//            for (int count = 0; count < holdNumb.length; count++){}

        }
    }

//    public static void convertArray(String[] array){
//        String arrayString = String.valueOf(array);
//    }
}
