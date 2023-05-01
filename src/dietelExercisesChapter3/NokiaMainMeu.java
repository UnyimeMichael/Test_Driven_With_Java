package dietelExercisesChapter3;
import java.util.Scanner;

public class NokiaMainMeu {
    static Scanner input = new Scanner(System.in);
    static int response;

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){
        System.out.println(""" 
                            press 1 for Phonebook
                            press 2 for Messages
                            press 3 for Chat
                            Press 4 for Call Register
                            Press 5 for Tones
                            Press 6 for Settings
                            Press 7 for Call divert
                            Press 8 for Games
                            Press 9 for calculate
                            Press 10 for Reminders
                            Press 11 for Clocks
                            Press 12 for Profiles
                            Press 13 for SIM services
                            """);

        response = input.nextInt();

        switch (response){
            case 1 -> phonebook();
            case 2 -> messages();
            case 3 -> settings();
        }

    }

    private static void settings() {
    }

    private static void messages() {
    }

    private static void phonebook() {
        System.out.println("press 1 for call log, \n2 for call duration and \n3 for phonebook settings. \npress 4 to go back");

        response = input.nextInt();

        switch (response){
            case 1 -> callLog();
            case 2 -> callDuration();
            case 3 -> phonebookSettings();
            case 4 -> mainMenu();
        }

    }

    private static void phonebookSettings() {
    }

    private static void callDuration() {
    }

    private static void callLog() {
    }
}
