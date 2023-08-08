package arrays;

public class ArrayFunctions {
    private int number;

    public void setLargestNumber(int[] number) {
        this.number = number[0];
//        for (int num : number) if (num > this.number) this.number = num;
        for (int index = 0; index < number.length; index++) {
            if (number[index] > this.number) this.number = number[index];
        }
    }

    public int getLargestNumber() {
        return number;
    }

    public int[] checkReversal(int[] arrayInput) {
        int[] arrayNumber = new int[arrayInput.length];
        for (int index = arrayInput.length - 1; index > -1; index--) {
            arrayNumber[arrayInput.length - index - 1] = arrayInput[index];
        }
        return arrayNumber;
    }

    public boolean checkElementExit(int[] arrList, int element) {
        for (int ArrayNumber : arrList) {
            if (element == ArrayNumber) return true;
        }
        return false;
    }

    public int[] oddPosition(int[] arrList) {
        int [] newArrList = new int[arrList.length/2];
        int counter = 0;
        for (int index = 0 ; index < arrList.length; index++){
            if (index % 2 != 0){
                newArrList[counter] = arrList[index];
                counter++;
            }
        }
        return newArrList;
    }
}