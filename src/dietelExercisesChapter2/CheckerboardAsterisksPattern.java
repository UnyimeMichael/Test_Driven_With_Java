package dietelExercisesChapter2;

public class CheckerboardAsterisksPattern {
    public static void main(String[] args) {

        int row;
        int column;


        for(row = 1; row <= 8; row++){

            for(column = 1; column <= 8; column++){
                if((row == 1) || (row == 8)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }


                if(column == 1 || column == 8) {
                    System.out.print("*");
                }

            }

            System.out.println();
        }
//        for (int i = 1 ; i <= 8 ; i++){
//            for (int j = i ; j <= 4; j++){
//                System.out.print("* ");
//            }
//        }        System.out.println();
    }


}
