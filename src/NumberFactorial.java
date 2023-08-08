public class NumberFactorial {

    private int factoredNumber;
    private int newNumber;

    public void NumberFactorial(int number) {
        factoredNumber = 1;

                for (int i = 1 ; i <= number ; i++) {
                        factoredNumber = factoredNumber * i;
                }

    }

    public int getNumberFactored() {
        return factoredNumber;
    }
}
