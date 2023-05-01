import java.util.Scanner;

public class NokiaMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Press 1 for Phone Book
                Press 2 for Messages
                Press 3 for Chat
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

        int number = input.nextInt();

        switch (number) {
            case 1 -> {
                System.out.println("Phone Book");
                System.out.println("""
                        Press 1 for Search
                        Press 2 for Service No
                        Press 3 for Add name
                        Press 4 for Erase
                        Press 5 for Edit
                        Press 6 for Assign Tone
                        Press 7 for Send b'Card
                        Press 8 for Option
                        Press 9 for Speed dials
                        Press 10 for Voice Tags
                        """);
                int number1 = input.nextInt();
                switch (number1) {
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service Nos");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign Tone");
                    case 7 -> System.out.println("Send b'card");
                    case 8 -> {
                        System.out.println("Options");
                        System.out.println("Press 1 for Type of View, Press 2 for Memory Status");
                        int number2 = input.nextInt();
                        switch (number2) {
                            case 1 -> System.out.println("Type of View");
                            case 2 -> System.out.println("Memory Status");
                        }
                    }
                    case 9 -> System.out.println("Speed dials");
                    case 10 -> System.out.println("voice Tags");
                }
            }
            case 2 -> {
                System.out.println("Messages");
                System.out.println("""
                        Press 1 for write Messages
                        Press 2 for Inbox
                        Press 3 for outbox
                        Press 4 for Picture Messages
                        Press 5 for Templates
                        Press 6 for Smileys
                        Press 7 for Message Settings
                        press 8 for info service
                        press 9 for voice mailbox number
                        press 10 for Service command editor
                        """);
                int number2 = input.nextInt();
                switch (number2) {
                    case 1 -> System.out.println("Write Messages");
                    case 2 -> System.out.println("inbox");
                    case 3 -> System.out.println("Output");
                    case 4 -> System.out.println("Picture Messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                        System.out.println("Message Settings");
                        System.out.println("Press 1 for Set 1, Press 2 for Common");
                        int number3 = input.nextInt();
                        switch (number3) {
                            case 1 -> {
                                System.out.println("Set 1");
                                System.out.println("Press 1 for Message centre Number, Press 2 for Message Sent as, Press 3 for Message Validity");
                                int number4 = input.nextInt();
                                switch (number4) {
                                    case 1 -> System.out.println("Message Centre Number");
                                    case 2 -> System.out.println("Message sent as");
                                    case 3 -> System.out.println("message validity");
                                }
                            }
                            case 2 -> {
                                System.out.println("common");
                                System.out.println("Press 1 for Delivery, Press 2 for Reply via same centre, press 3 for character support");
                                int number6 = input.nextInt();
                                switch (number6) {
                                    case 1 -> System.out.println("Deliver reports");
                                    case 2 -> System.out.println("Reply via Same centre");
                                    case 3 -> System.out.println("character support");
                                }
                            }
                        }
                    }
                    case 8 -> System.out.println("Info services");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("service command editor");
                }
            }
            case 3 -> System.out.println("Chat");
            case 4 -> {
                System.out.println("Call Register");
                System.out.println("""
                                Press 1 for Missed Call
                                Press 2 for Receive calls
                                Press 3 for Dialled numbers
                                Press 4 for Erase recent call lists
                                Press 5 for Show call duration
                                Press 6 for Show call costs
                                Press 7 for Call cost settings
                                Press 8 for Prepaid credit
                                """);
                int number4 = input.nextInt();
                switch (number4) {
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("Dialled numbers");
                    case 4 -> System.out.println("Erase recent call lists");
                    case 5 -> {
                        System.out.println("Show call duration");
                        System.out.println("""
                                    press 1 for Last call duration
                                    press 2 for All calls duration
                                    press 3 for Received calls' duration
                                    press 4 for Dialled calls' duration
                                    press 5 for Clear timer
                                    """);
                        int number6 = input.nextInt();
                        switch (number6) {
                            case 1 ->System.out.println("last call duration");
                            case 2 -> System.out.println("All calls’duration");
                            case 3 ->System.out.println("Received calls’duration");
                            case 4 ->System.out.println("Dialled calls’duration");
                            case 5 -> System.out.println("Clear timers");
                        }
                    }
                    case 6 -> {
                        System.out.println("Show call costs");
                        System.out.println("""
                                    Press 1 for last call cost
                                    press 2 for All calls' cost
                                    press 3 for clear counter
                                    """);
                        int number5 = input.nextInt();
                        switch (number5) {
                            case 1 ->System.out.println("Last call cost");
                            case 2 ->System.out.println("All calls’cost");
                            case 3 -> System.out.println("Clear counters");
                        }
                    }
                    case 7 -> {
                        System.out.println("Call cost settings");
                        System.out.println("Press 1 for call cost limit, press 2 for show cost in ");
                        int number7 = input.nextInt();
                        switch (number7) {
                            case 1 -> System.out.println("Call cost limit");
                            case 2 -> System.out.println("Show costs in");
                        }
                    }
                    case 8 -> System.out.println("Prepaid credit");
                }
            }
            case 5 -> {
                System.out.println("Tones");
                System.out.println("""
                                   press 1 for Ringing Tone
                                   Press 2 for Ringing Volume
                                   Press 3 for incoming call Alert
                                   Press 4 for composer
                                   press 5 for Message alert tone
                                   press 6 for keypad tones
                                   press 7 for warning and game tones
                                   press 8 for vibrating alert
                                   press 9 for screen saver
                                   """);
                int number5 = input.nextInt();
                switch (number5){
                    case 1 -> System.out.println("Ringing tone");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("incoming call alert");
                    case 4 -> System.out.println("composer");
                    case 5 -> System.out.println("Message alert tone");
                    case 6 -> System.out.println("keypad tones");
                    case 7 -> System.out.println("warning and game tone");
                    case 8 -> System.out.println("vibrating alert");
                    case 9 -> System.out.println("Screen Saver");
                }
            }

            case 6 -> {
                System.out.println("Settings");
                System.out.println("""
                                press 1 for Call settings
                                press 2 for Phone settings
                                press 3 for security settings
                                press 4 for Restore factory settings
                                """);
                int number6 = input.nextInt();
                switch (number6){
                    case 1 -> {
                        System.out.println("call settings");
                        System.out.println("""
                                        Press 1 for Automatic redial
                                        Press 2 for speed dialing
                                        press 3 for call waiting options
                                        press 4 for owning number sending
                                        press 5 for Phone line in use
                                        press 6 for Automatic Answer
                                        """);
                        int number3 = input.nextInt();
                        switch (number3){
                            case 1 -> System.out.println("Automatic redial");
                            case 2 -> System.out.println("speed dialing");
                            case 3 -> System.out.println("call waiting options");
                            case 4 -> System.out.println("Owning number sending");
                            case 5 -> System.out.println("phone line in use");
                            case 6 -> System.out.println("Automatic Answer");
                        }
                    }
                    case 2 -> {
                        System.out.println("Phone settings");
                        System.out.println("""
                                        press 1 for Language
                                        press 2 for cell info display
                                        press 3 for welcome note
                                        press 4 for Network Selection
                                        press 5 for lights
                                        press 6 for Confirming SIM service actions
                                        """);
                        int number7 = input.nextInt();
                        switch (number7){
                            case 1 ->System.out.println("language");
                            case 2 ->System.out.println("Cell info display");
                            case 3 ->System.out.println("Welcome note");
                            case 4 ->System.out.println("Network selection");
                            case 5 ->System.out.println("lights");
                            case 6 -> System.out.println("Change access Code");
                        }
                    }                    case 3 -> {
                        System.out.println("Security settings");
                        System.out.println("""
                                        Press 1 for PIN code request
                                        Press 2 for Call barring service
                                        Press 3 for Fixed dialling
                                        Press 4 for Close user group
                                        Press 5 for Phone Security,
                                        Press 6 for Change access codes
                                        """);
                        int number8 = input.nextInt();
                        switch (number8){
                            case 1 -> System.out.println("PIN code request");
                            case 2 -> System.out.println("Call barring service");
                            case 3 -> System.out.println("Fixed dialling");
                            case 4 -> System.out.println("Closed user group");
                            case 5 -> System.out.println("Phone security");
                            case 6 -> System.out.println("Change access codes");
                        }
                    }
                    case 4 -> System.out.println("Restore factory Settings");
                }
            }
            case 7 -> System.out.println("Call divert");
            case 8 -> System.out.println("Games");
            case 9 ->System.out.println("Calculate");
            case 10 -> System.out.println("Reminder");
            case 11 -> {
                System.out.println("Clocks");
                System.out.println("""
                                Press 1 for Alarm clock
                                Press 2 for Clock settings
                                Press 3 for Date setting
                                Press 4 for Stopwatch
                                Press 5 for Countdown timer
                                Press 6 for Auto update of date and time
                                """);
                int number8 = input.nextInt();
                switch (number8){
                    case 1 -> System.out.println("Alarm clock");
                    case 2 ->System.out.println("Clock settings");
                    case 3 -> System.out.println("Date setting");
                    case 4 ->System.out.println("Stopwatch");
                    case 5 -> System.out.println("Countdown timer");
                    case 6 -> System.out.println("Auto update of date and time");
            }
            }
            case 12 -> System.out.println("Profile");
            case 13 -> System.out.println("SIM");
            default -> System.out.println("Invalid Input");
        }


    }

    public void phoneBookMenu() {

    }
}
