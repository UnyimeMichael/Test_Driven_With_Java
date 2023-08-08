package objectOrientedProgramming;

public class ArrayContent {
    public int[] getArrayValue(int[] array) {
        int[] arrayValue = new int[6];
        int count = 0;
        for (int index = 0; index < array.length; index++) {
            arrayValue[count] = array[index];
            count++;
        }
        return arrayValue;
    }
}
