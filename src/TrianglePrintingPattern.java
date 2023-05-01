public class TrianglePrintingPattern {
    public static void main(String[] args) {
        int n = 10;
        for (int print1 = 1 ; print1 <= n ; print1++) {
            for (int print2 = 1; print2 <= print1; print2++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


            for (int print1 = 1; print1 <= n; print1++) {
                for (int print2 = print1; print2 <= n; print2++) {
                    System.out.print("*");
                }
                System.out.println();
            }


    }
}
