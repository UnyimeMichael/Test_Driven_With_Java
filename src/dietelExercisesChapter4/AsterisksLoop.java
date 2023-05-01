package dietelExercisesChapter4;

public class AsterisksLoop {
    public static void main(String[] args) {

//        int i = 1;
//        while (i <= 5) {
//            int j = 1;
//            while (j < i) {
//                System.out.print(" ");
//                j++;
//            }
//            int k = 5;
//            while (k >= i){
//                System.out.print("*");
//                k--;
//            }
//            System.out.println();
//            i++;
//        }
//
//        int i = 1;
//        while (i <= 5) {
//            int j = 1;
//            while (j < 5) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//
//int count = 1;
//while (count <= 5) {
//    int countTwo = 1;
//    while (countTwo < count) {
//        System.out.print(" ");
//        countTwo++;
//    }
//    int countThree = 5;
//    while (countThree >= count) {
//        System.out.print("*");
//        countThree--;
//    }
//    System.out.println();
//    count++;
//        }

//
//int count = 1;
//while (count <= 10){
//    int count1 = 1;
//    while (count1 < count){
//        System.out.print(" ");
//        count1 = count1 + 2;
//    }
//    int count2 = 5;
//    while(count2 >= count){
//        System.out.print("*");
//        count2--;
//    }
//
//    System.out.println();
//    count = count + 2;
//}

  int count = 1;
  while (count <= 10){
          int count1 = 1;
          while (count1 <= 10) {
              System.out.print(" * ");
              count1++;
          }
      count++;
      System.out.println();
      if (count % 2 == 0) {
          System.out.print(" ");
      }


  }




    }
}