package tdd;

import java.util.Arrays;

public class OddPosition {

    public int[] identifyOddPosition(int[] arrays) {
        int[] oddPosition = new int[3];
        int count = 0;
        for(int index = 0; index < arrays.length; index+=2){
            oddPosition[count] = arrays[index];
            count ++;
        }


        return oddPosition;
    }
}
