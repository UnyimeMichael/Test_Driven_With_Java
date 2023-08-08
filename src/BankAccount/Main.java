package BankAccount;

import java.util.Scanner;

public class Main {
    private static Scanner userInput = new Scanner(System.in);
    private static BankAccount bankAccount = new BankAccount();
    public static void main(String[] args) {
        entryPoint();
    }
    private static void entryPoint(){
        displayMessage("""
                Welcome to our bank
                Kindly choose your preferred choice: 
                1 -> Register Account
                2 -> Cash Transaction
                3 -> Exit
                """);
        entryChoice();
    }
    private static void entryChoice(){
        String userChoice = userInput.nextLine();
        switch (userChoice.charAt(0)){
            case '1' -> registerCustomer();
            case '2' -> cashTransaction();
            case '3' -> exitBank();
        }
    }
    private static void registerCustomer() {
        displayMessage("Hi let get you registered in our bank\n");
        displayMessage("Enter your name: ");
        try {
            String name = userInput.nextLine();
            displayMessage("Enter preferred password: ");
            String password = userInput.nextLine();
            bankAccount.createAccount(name, password);
            displayMessage("Account Number is "+bankAccount.getAccountNumber());
        }catch (Exception exception){
            displayMessage(exception.getMessage());
        }
        cashTransaction();
    }
    private static void exitBank() {
        displayMessage("Bye-Bye");
        System.exit(5);
    }
    private static void cashTransaction() {
        displayMessage("\ni am in cashing\n");
    }
    //    private static String input(Scanner userInput){
//        return userInput.nextLine();
//    }
    private static void displayMessage(String message){
        System.out.printf("%s", message);
    }
}
