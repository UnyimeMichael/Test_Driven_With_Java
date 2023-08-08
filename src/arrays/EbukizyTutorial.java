package arrays;

import java.util.Arrays;

public class EbukizyTutorial {
    public static void main(String[] args) {


        int[] myArrays = {1, 3, 2, 34, 56, 76, 43, 23, 98, 76, 44, 32, 12, 35, 67};
        int[] arrays = new int[myArrays.length];
        int k = 0;
        int j = myArrays.length - 1;
        for (int i = 0; i < myArrays.length; i++) {
            if (myArrays[i] % 2 == 0) {
                arrays[k++] = myArrays[i];
            } else arrays[j--] = myArrays[i];
        }
        System.out.println(Arrays.toString(arrays));

        copyArray(myArrays, arrays);
        System.out.println(Arrays.toString(myArrays));


    }

    private static void copyArray(int[] myArrays, int[] arrays) {
        for(int i = 0; i < arrays.length; i++){
            myArrays[i] = arrays[i];
        }
    }

}