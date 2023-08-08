package Methods;

public class Test {
    public static void main(String[] args) {
        int max = 0;
        maximum(1, 2, max);
        System.out.println(max);
    }

    public static int maximum(int number1, int number2, int max){
        if(number1 > number2)
            max = number1;
        else max = number2;
        System.out.println(max);
        return max;
    }

}
