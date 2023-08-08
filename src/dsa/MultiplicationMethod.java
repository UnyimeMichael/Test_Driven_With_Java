package dsa;

public class MultiplicationMethod {

    private int result;

    public void multiplyElement(int number1, int number2) {
//        if (number1 > 0 && number2 > 0) {
            for (int count = 1; count <= number2; count++) {
                result += number1;
            }
//        }
        }

    public int getMultipliedElement() {
        return result;
    }
}
