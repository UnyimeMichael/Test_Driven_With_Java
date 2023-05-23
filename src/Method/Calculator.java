package Method;

public class Calculator {
    private int result;

    public Calculator(int result){
        this.result = result;
    }
    public void divideNumbers(int num1, int num2){
        validate(num1, num2);
        result = num1 / num2;

    }

    private void validate(int num1, int num2) {
        if (num2 <= 0) System.out.println("denominator input cannot be zero");
    }

    public int getAnswer(){
        return result;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator(0);
        calculator.divideNumbers(4, 0);
        System.out.println(calculator.getAnswer());

    }
}
