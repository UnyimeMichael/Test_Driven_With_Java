public class MaxAndMinNumber {
    public int getMaxNumber(int num1, int num2, int num3) {
        return Math.max(num1,Math.max(num2,num3));
    }

    public int getMinNumber(int num1 , int num2, int num3) {
        return Math.min(num1, Math.min(num2,num3));
    }
}
