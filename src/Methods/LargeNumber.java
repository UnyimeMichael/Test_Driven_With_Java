package Methods;

public class LargeNumber {
    public static int numberComparison(int num1, int num2){
        int largerNumber;
        if (num1 < num2) {
            largerNumber = num2;
        } else largerNumber = num1;
        return largerNumber;
    }

    public static void main(String[] args) {
        System.out.println("The larger number is " + numberComparison(2,5));
        System.out.println("The larger number is " + numberComparison(7,3));
    }
}
