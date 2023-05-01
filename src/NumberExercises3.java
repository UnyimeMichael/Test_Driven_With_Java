import java.util.Scanner;

public class NumberExercises3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int scores;
      int counter = 1;
   //   int counter2 = 0;
      int sumTotal = 0;
      while (counter != 0){
          System.out.println("Enter scores");
         scores = input.nextInt();
         if(scores >= 0 && scores <= 100){
             sumTotal = sumTotal + scores;
             counter++;
         }
         if(counter == 5){
             break;
         }
      }
        System.out.println("The sumTotal of valid Scores is : " + sumTotal);
    }
}
