package tdd;

public class EvenPosition {
    public int[] evenPositionIdentifier(int[] array){
        int[] evenNumberPosition = new int[4];
        int count = 0;
       for(int index = 1; index < array.length; index+=2){
           evenNumberPosition [count]= array[index];
           count++;

       }
        return evenNumberPosition;
    }
}
