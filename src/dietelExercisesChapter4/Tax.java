package dietelExercisesChapter4;

public class Tax {

    private double tax;

    public void setTax(double amount) {
        if (amount > 0 && amount <= 30_000) {
            tax = (15 * amount) / 100;
        }
        else if(amount > 30_000) {
            tax = (20 * amount) / 100;
        }
    }


    public double getTax() {
        return tax;
    }
}
