package Methods;

public class MethodPrint123 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 6){
            method1(i, 1);
            i++;
        }
    }

    public static void method1(int i , int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num);
            num += 1;
//            System.out.print(num);
        }
        System.out.println();
    }
}
