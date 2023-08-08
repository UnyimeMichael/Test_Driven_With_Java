package arrays;

public class Most_Occurring_Number {
    public static void main(String[] args) {

        int[] array = new int[]{3, 5, 5, 8, 3, 8, 8, 2};
        numberOfOccurrence(array);
    }


    public static int[] numberOfOccurrence(int[] array) {
        int index;
        int arrayElement;
        int occuredElement = 0;
        int count = 1;
        for (index = 0; index < array.length - 1; index++) {
            arrayElement = array[index];
            if (arrayElement == arrayElement){
                occuredElement += arrayElement;
                count++;
            }
        }
        return array;
    }
}
