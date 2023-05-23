public class ArithmeticProcessesMain {
    public static void main(String[] args) {
        ArithmeticProcesses arith = new ArithmeticProcesses();
        int a = arith.add(3,5,7);
        int b = arith.add(3,6);
        double c = arith.add(3,5.5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
