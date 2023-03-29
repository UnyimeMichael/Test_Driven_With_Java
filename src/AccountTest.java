import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Account myAccount = new Account("Jane");
        //System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please Enter name1");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println("Enter name2");
        String theName2 = input.nextLine();
        myAccount.setName(theName2);
       // System.out.println();
        System.out.println("Hello " + theName + " , its nice to meet you");
        System.out.println("Hello " + theName2 + " , you are welcome");
        System.out.println(theName + " is happily married to " + theName2);


    }
}
