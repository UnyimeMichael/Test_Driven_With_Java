package Methods;

public class MethodIteration {
    public static int sum(int num1, int num2){
        int result = 0;
        for (int i = num1; i <= num2; i++)
            result += i;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum from 1 to 10 is " + sum(1, 10));
        System.out.println("The sum from 20 to 30 is " + sum(20,30));
        System.out.println("The sum from 40 to 50 " + sum(40 , 50));

    }
}
