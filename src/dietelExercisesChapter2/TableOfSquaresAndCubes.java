package dietelExercisesChapter2;

public class TableOfSquaresAndCubes {
    public static void main(String[] args) {
        int square;
        int cube;
        System.out.printf("%s%8s%5s%n", "number", "Square", "Cube");
        for (int number = 0; number <= 10; number++){
            square = number * number;
            cube = number * number * number;
            System.out.printf("%d%8d%8d%n", number, square, cube);
        }

    }
}
