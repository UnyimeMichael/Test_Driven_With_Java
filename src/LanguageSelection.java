import java.util.Scanner;

public class LanguageSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Number");
//        int number = input.nextInt();
//        if (number == 1){
//            System.out.println("Press 1 - for En");
//        }
        System.out.println("Enter 1 for English, 2 for Yoruba , 3 for Igbo , 4 for Hausa...");

            int number = input.nextInt();

            switch (number) {
                case 1:
                    System.out.println("English");
                    break;

                case 2:
                    System.out.println("Yoruba");
                    break;

                case 3:
                    System.out.println("Igbo");
                    break;

                case 4:
                    System.out.println("Hausa");
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }


    }
}
