package App_Methods;


import java.util.Scanner;

public class NokiaApp {
    static Scanner userInput = new Scanner(System.in);
    static int number;
    public static void main(String[] args) {

        nokiaMenu();

    }

    public static void nokiaMenu() {
        display("""
                Welcome-- Nokia Menu
                Press 1. Phone Book
                Press 2. Messages
                Press 3. Chat
                Press 4. Call Register
                Press 5. Tones
                Press 6. Settings
                Press 7. Call divert
                Press 8. Games
                Press 9. calculate
                Press 10. Reminders
                Press 11. Clocks
                Press 12. Profiles
                Press 13. SIM services
                
                Enter a Number :
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> phone_BooK();
            case 2 -> message();
            case 3 -> chat();
            case 4 -> call_Register();
            case 5 -> tones();
            case 6 -> settings();
            case 7 -> call_divert();
            case 8 -> games();
            case 9 -> calculate();
            case 10 -> reminders();
            case 11 -> clock();
            case 12 -> profiles();
            case 13 -> sim_services();
            case 14 -> nokiaMenu();
        }

    }

    private static void sim_services() {
        display("""
                Sim Services
                """);
        number = userInput.nextInt();
        nokiaMenu();
    }

    private static void profiles() {
        display("""
                Profiles
                """);
        number = userInput.nextInt();
        nokiaMenu();
    }

    private static void clock() {
        display("""
                Clock
                Press 1. Alarm clock
                Press 2. Clock settings
                Press 3. Date setting
                Press 4. Stopwatch
                Press 5. Countdown timer
                Press 6. Auto update of date and time
                
                Enter a Number :
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> alarm_Clock();
            case 2 -> clock_Settings();
            case 3 -> date_Setting();
            case 4 -> stopwatch();
            case 5 -> countdown_Timer();
            case 6 -> auto_Update_Of_DAte_And_Time();
            default -> nokiaMenu();
        }
    }

    private static void auto_Update_Of_DAte_And_Time() {
        display("""
                Auto Update Of Date And Time
                """);
        number = userInput.nextInt();
        clock();
    }

    private static void countdown_Timer() {
        display("""
                Countdown Timer
                """);
        number = userInput.nextInt();
        clock();
    }

    private static void stopwatch() {
        display("""
                Stopwatch
                """);
        number = userInput.nextInt();
        clock();
    }

    private static void date_Setting() {
        display("""
                Date Setting
                """);
        number = userInput.nextInt();
        clock();
    }

    private static void clock_Settings() {
        display("""
                Clock Setting
                """);
        number = userInput.nextInt();
        clock();
    }

    private static void alarm_Clock() {
        display("""
                Alarm Clock
                """);
        number = userInput.nextInt();
        clock();
    }

    private static void reminders() {
        display("""
                Reminders
                """);
        number = userInput.nextInt();
        nokiaMenu();
    }

    private static void calculate() {
        display("""
                Calculator
                """);
        number = userInput.nextInt();
        nokiaMenu();
    }

    private static void games() {
        display("""
                Games
                """);
        number = userInput.nextInt();
        nokiaMenu();
    }

    private static void call_divert() {
        display("""
                Call Divert
                """);
        number = userInput.nextInt();
        nokiaMenu();
    }

    private static void settings() {
        display("""
                Settings
                Press 1. Call settings
                Press 2. Phone settings
                Press 3. Security settings
                Press 4. Restore factory settings
                
                Enter a Number:
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> call_Settings();
            case 2 -> phone_Settings();
            case 3 -> security_Settings();
            case 4 -> restore_Factory_Settings();
            default -> nokiaMenu();
        }
    }

    private static void restore_Factory_Settings() {
        display("""
                Restore Factory Security
                """);
        number = userInput.nextInt();
        settings();
    }

    private static void security_Settings() {
        display("""
                Security Settings
                Press 1. PIN code request
                Press 2. Call barring service
                Press 3. Fixed dialling
                Press 4. Closed user group
                Press 5. Phone security
                Press 6. Change access codes
                
                Enter a Number:
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> pin_Code_Request();
            case 2 -> call_Barring_Service();
            case 3 -> fixed_Dialling();
            case 4 -> closed_User_group();
            case 5 -> phone_Security();
            case 6 -> change_Access_Codes();
            default -> settings();
        }
    }

    private static void change_Access_Codes() {
        display("""
                Change Access Codes
                """);
        number = userInput.nextInt();
        security_Settings();
    }

    private static void phone_Security() {
        display("""
                Phone Security
                """);
        number = userInput.nextInt();
        security_Settings();
    }

    private static void closed_User_group() {
        display("""
                Closed User Group
                """);
        number = userInput.nextInt();
        security_Settings();
    }

    private static void fixed_Dialling() {
        display("""
                Fixed Dialling
                """);
        number = userInput.nextInt();
        security_Settings();
    }

    private static void call_Barring_Service() {
        display("""
                call Barring Service
                """);
        number = userInput.nextInt();
        security_Settings();
    }

    private static void pin_Code_Request() {
        display("""
                PIN code Request
                """);
        number = userInput.nextInt();
        security_Settings();
    }

    private static void phone_Settings() {
        display("""
                Phone Settings
                Press 1. Language
                Press 2. Cell info display
                Press 3. Welcome note
                Press 4. Network selection
                Press 5. Lights2
                Press 6. Confirm SIM service actions
                
                Enter a Number:
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> language();
            case 2 -> cell_Info_Display();
            case 3 -> welcome_Note();
            case 4 -> network_Selection();
            case 5 -> lights2();
            case 6 -> Confirm_SIM_Service_Actions();
            default -> settings();
        }
    }

    private static void Confirm_SIM_Service_Actions() {
        display("""
                Confirm SIM Service Actions
                """);
        number = userInput.nextInt();
        phone_Settings();
    }

    private static void lights2() {
        display("""
                Lights2
                """);
        number = userInput.nextInt();
        phone_Settings();
    }

    private static void network_Selection() {
        display("""
                Network Selection
                """);
        number = userInput.nextInt();
        phone_Settings();
    }

    private static void welcome_Note() {
        display("""
                Welcome Note
                """);
        number = userInput.nextInt();
        phone_Settings();
    }

    private static void cell_Info_Display() {
        display("""
                Cell Info Display
                """);
        number = userInput.nextInt();
        phone_Settings();
    }

    private static void language() {
        display("""
                Language
                """);
        number = userInput.nextInt();
        phone_Settings();
    }

    private static void call_Settings() {
        display("""
                Call Settings
                Press 1. Automatic redial
                Press 2. Speed dialling
                Press 3. Call waiting options
                Press 4. Own number sending
                Press 5. Phone line in use
                Press 6. Automatic answer
                
                Enter a Number:
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> automatic_Redial();
            case 2 -> speed_Dialling();
            case 3 -> call_Waiting_Options();
            case 4 -> own_Number_Sending();
            case 5 -> phone_Line_In_Use();
            case 6 -> automatic_Answer();
            default -> settings();
        }
    }

    private static void automatic_Answer() {
        display("""
                Automatic Answer
                """);
        number = userInput.nextInt();
        call_Settings();
    }

    private static void phone_Line_In_Use() {
        display("""
                Phone Line In Use
                """);
        number = userInput.nextInt();
        call_Settings();
    }

    private static void own_Number_Sending() {
        display("""
                Own Number Sending
                """);
        number = userInput.nextInt();
        call_Settings();
    }

    private static void call_Waiting_Options() {
        display("""
                Call Waiting Options
                """);
        number = userInput.nextInt();
        call_Settings();
    }

    private static void speed_Dialling() {
        display("""
                Speed dialling
                """);
        number = userInput.nextInt();
        call_Settings();
    }

    private static void automatic_Redial() {
        display("""
                Automatic Redial
                """);
        number = userInput.nextInt();
        call_Settings();
    }

    private static void tones() {
        display("""
                Tones
                Press 1. Ringing tone
                Press 2. Ringing volume
                Press 3. Incoming call alert
                Press 4. Composer
                Press 5. Message alert tone
                Press 6. Keypad tones
                Press 7. Warning and game tones
                Press 8. Vibrating alert
                Press 9. Screen saver
                
                Enter a Number:
                """);
        number = userInput.nextInt();
        switch (number){
            case 1 -> ringing_tone();
            case 2 -> ringing_Volume();
            case 3 -> incoming_Call_Alert();
            case 4 -> composer();
            case 5 -> message_Alert_Tone();
            case 6 -> keypad_Tones();
            case 7 -> warning_And_Game_Tones();
            case 8 -> vibration_Alert();
            case 9 -> screen_Saver();
            default -> nokiaMenu();
        }
    }

    private static void screen_Saver() {
        display("""
                Screen Saver
                """);
        number = userInput.nextInt();
        tones();
    }

    private static void vibration_Alert() {
        display("""
                Vibration Alert
                """);
        number = userInput.nextInt();
        tones();
    }

    private static void warning_And_Game_Tones() {
        display("""
                Warning And Game Tones
                """);
        number = userInput.nextInt();
        tones();
    }

    private static void keypad_Tones() {
        display("""
                Keypad Tones
                """);
        number = userInput.nextInt();
        tones();
    }

    private static void message_Alert_Tone() {
        display("""
                Message Alert Tone
                """);
        number = userInput.nextInt();
        tones();
    }

    private static void composer() {
        display("""
                Composer
                """);
        number = userInput.nextInt();
        tones();
    }

    private static void incoming_Call_Alert() {
        display("""
                Incoming Call Alert
                """);
        number = userInput.nextInt();
        tones();
    }

    private static void ringing_Volume() {
        display("""
                Ring Volume
                """);
        number = userInput.nextInt();
        tones();
    }

    private static void ringing_tone() {
        display("""
                Ring Tone
                """);
        number = userInput.nextInt();
        tones();
    }

    private static void call_Register() {
        display("""
                Call register
                Press 1. Missed calls
                Press 2. Received calls
                Press 3. Dialled numbers
                Press 4. Erase recent call lists
                Press 5. Show call duration
                Press 6. Show call costs
                Press 7. Call cost settings
                Press 8. Prepaid credit
                
                Enter a Number :
                """);
        number = userInput.nextInt();
        switch (number){
            case 1 -> missed_Calls();
            case 2 -> received_Calls();
            case 3 -> dialled_Numbers();
            case 4 -> erase_Recent_Call_Lists();
            case 5 -> show_Call_duration();
            case 6 -> show_Call_Costs();
            case 7 -> call_Cost_Settings();
            case 8 -> prepaid_Credit();
            default -> nokiaMenu();
        }
    }

    private static void prepaid_Credit() {
        display("""
                Prepaid Credit
                """);
        number = userInput.nextInt();
        call_Register();

    }

    private static void call_Cost_Settings() {
        display("""
                Call Cost Settings
                Press 1. Call cost limit
                Press 2. Show costs in
                
                Enter a Number:
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> call_Cost_limit();
            case 2 -> show_Costs_In();
            default -> call_Register();
        }
    }

    private static void show_Costs_In() {
        display("""
                Show Costs In
                """);
        number = userInput.nextInt();
        call_Cost_Settings();
    }

    private static void call_Cost_limit() {
        display("""
                Call Cost Limit
                """);
        number = userInput.nextInt();
        call_Cost_Settings();
    }

    private static void show_Call_Costs() {
        display("""
                Show Call Costs
                Press 1. Last call cost
                Press 2. All calls’ cost
                Press 3. Clear counters
                
                Enter a Number:
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> last_Call_Cost();
            case 2 -> all_Calls_Cost();
            case 3 -> clear_Counter();
            default -> call_Register();
        }
    }

    private static void clear_Counter() {
        display("""
                Clear Counter
                """);
        number = userInput.nextInt();
        show_Call_Costs();
    }

    private static void all_Calls_Cost() {
        display("""
                All Calls' Cost
                """);
        number = userInput.nextInt();
        show_Call_Costs();
    }

    private static void last_Call_Cost() {
        display("""
                Last Call Cost
                """);
        number = userInput.nextInt();
        show_Call_Costs();
    }

    private static void show_Call_duration() {
        display("""
                Show Call Duration
                Press 1. Last call duration
                Press 2. All calls’ duration
                Press 3. Received calls’ duration
                Press 4. Dialled calls’ duration
                Press 5. Clear timers
                
                Enter a number:
                """);
        number = userInput.nextInt();
        switch (number){
            case 1 -> last_Call_duration();
            case 2 -> all_Calls_Duration();
            case 3 -> received_Calls_duration();
            case 4 -> dialled_Calls_duration();
            case 5 -> clear_Timers();
            default -> call_Register();

        }
    }

    private static void clear_Timers() {
        display("""
                Clear Timers
                """);
        number = userInput.nextInt();
        show_Call_duration();
    }

    private static void dialled_Calls_duration() {
        display("""
                Dialled Calls' Duration
                """);
        number = userInput.nextInt();
        show_Call_duration();
    }

    private static void received_Calls_duration() {
        display("""
                Received Calls' Duration
                """);
        number = userInput.nextInt();
        show_Call_duration();
    }

    private static void all_Calls_Duration() {
        display("""
                All Calls Duration
                """);
        number = userInput.nextInt();
        show_Call_duration();
    }

    private static void last_Call_duration() {
        display("""
                Last Call Duration
                """);
        number = userInput.nextInt();
        show_Call_duration();
    }

    private static void erase_Recent_Call_Lists() {
        display("""
                Erase Recent Call Lists
                """);
        number = userInput.nextInt();
        call_Register();

    }

    private static void dialled_Numbers() {
        display("""
                Dialled Numbers
                """);
        number = userInput.nextInt();
        call_Register();

    }

    private static void received_Calls() {
        display("""
                Received Calls
                """);
        number = userInput.nextInt();
        call_Register();
    }

    private static void missed_Calls() {
        display("""
                Missed Calls
                """);
        number = userInput.nextInt();
        call_Register();
    }

    private static void chat() {
        display("""
                Voice Mailbox Number
                """);
        number = userInput.nextInt();
        nokiaMenu();
    }

    private static void message() {
        display("""
                Messages
                Press 1. Write messages
                Press 2. Inbox
                Press 3. Outbox
                Press 4. Picture messages
                Press 5. Templates
                Press 6. Smileys
                Press 7. Message settings
                Press 8. Info service
                Press 9. Voice mailbox number
                Press 10.Service command editor
                
                Enter a Number :
                """);
        number = userInput.nextInt();
        switch (number){
            case 1 -> write_Messages();
            case 2 -> inbox();
            case 3 -> outbox();
            case 4 -> picture_Messages();
            case 5 -> templates();
            case 6 -> smileys();
            case 7 -> message_Settings();
            case 8 -> info_Service();
            case 9 -> voice_Mailbox_Number();
            case 10 -> service_Command_Editor();
            default -> nokiaMenu();
        }
    }

    private static void service_Command_Editor() {
        display("""
                Service Command Editor
                """);
        number = userInput.nextInt();
        message();
    }

    private static void voice_Mailbox_Number() {
        display("""
                Voice Mailbox Number
                """);
        number = userInput.nextInt();
        message();
    }

    private static void info_Service() {
        display("""
                Info Service
                """);
        number = userInput.nextInt();
        message();
    }

    private static void message_Settings() {
        display("""
                Message settings :
                Press 1. Set 1 :
                Press 2. Common :
                
                Enter a Number :
                """);
        number = userInput.nextInt();
        switch (number){
            case 1 -> set_1();
            case 2 -> common();
            default -> message();
        }
    }

    private static void common() {
        display("""
                Common
                Press 1. Delivery reports
                Press 2. Reply via same centre
                Press 3. Character support
                
                Enter a Number :
                """);
        number = userInput.nextInt();
        switch (number){
            case 1 -> delivery_Reports();
            case 2 -> reply_Via_Same_Centre();
            case 3 -> character_Support();
            default -> message_Settings();
        }
    }

    private static void character_Support() {
        display("""
                Character Support
                """);
        number = userInput.nextInt();
        common();
    }

    private static void reply_Via_Same_Centre() {
        display("""
                Reply Via Same Centre
                """);
        number = userInput.nextInt();
        common();
    }

    private static void delivery_Reports() {
        display("""
                Delivery Reports
                """);
        number = userInput.nextInt();
        common();
    }

    private static void set_1() {
        display("""
                Set_1
                Press 1. Message centre number
                Press 2. Messages sent as
                Press 3. Message validity
                
                Enter a Number
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> message_Centre_Number();
            case 2 -> message_Sent_as();
            case 3 -> message_Validity();
            default -> message_Settings();
        }
    }

    private static void message_Validity() {
        display("""
                Message Setting
                """);
        number = userInput.nextInt();
        set_1();
    }

    private static void message_Sent_as() {
        display("""
                Message Sent As
                """);
        number = userInput.nextInt();
        set_1();
    }

    private static void message_Centre_Number() {
        display("""
                Message Centre Number
                """);
        number = userInput.nextInt();
        set_1();
    }

    private static void smileys() {
        display("""
                Smileys
                """);
        number = userInput.nextInt();
        message();
    }

    private static void templates() {
        display("""
                Templates
                """);
        number = userInput.nextInt();
        message();
    }

    private static void picture_Messages() {
        display("""
                Picture Messages
                
                Press 1. Previous Menu          2. Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> message();
            case 2 -> nokiaMenu();
        }
    }

    private static void outbox() {
        display("""
                Outbox
                
                Press 1. Previous Menu          2. Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> message();
            case 2 -> nokiaMenu();
        }
    }

    private static void inbox() {
        display("""
                Inbox
                
                Press 1. Previous Menu          2. Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> message();
            case 2 -> nokiaMenu();
        }
    }

    private static void write_Messages() {
        display("""
                Write your Message
                
                Press 1. Previous Menu          2. Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> message();
            case 2 -> nokiaMenu();
        }
    }

    private static void phone_BooK() {

        display("""
                Phone Book :
                Press 1. Search
                Press 2. Service No
                Press 3. Add name
                Press 4. Erase
                Press 5. Edit
                Press 6. Assign Tone
                Press 7. Send b'Card
                Press 8. Options
                Press 9.  Speed dials
                Press 10. Voice Tags
                Press 11. Main Menu
                
                Enter a Number :
                """);
        number = userInput.nextInt();
        switch (number){
            case 1 -> search();
            case 2 -> service_No();
            case 3 -> add_name();
            case 4 -> erase();
            case 5 -> edit();
            case 6 -> assign_Tone();
            case 7 -> send_BCard();
            case 8 -> options();
            case 9 -> speed_dials();
            case 10 -> voice_Tags();
            case 11 -> nokiaMenu();
        }
    }

    private static void voice_Tags() {
        display("""
                Voice Tags :
                
                Press 1. Previous Menu          2. Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> phone_BooK();
            case 2 -> nokiaMenu();
        }
    }

    private static void speed_dials() {
        display("""
                Speed Dials :
                
                Press 1. Previous Menu          2. Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> phone_BooK();
            case 2 -> nokiaMenu();
        }
    }

    private static void options() {
        display("""
                Options :
                Press 1. Type Of View
                Press 2. Memory Status
                
                Press 3. Previous Menu          4. Main Menu
                
                
                Enter number :
                """);
        number = userInput.nextInt();
        switch (number){
            case 1 -> type_Of_View();
            case 2 -> memory_Status();
            case 3 -> phone_BooK();
            case 4 -> nokiaMenu();
        }
    }

    private static void memory_Status() {
        display("""
                Memory Status :
                
                Press 1. Previous Menu          2. Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> options();
            case 2 -> nokiaMenu();
        }
    }

    private static void type_Of_View() {
        display("""
                Type Of View :
                
                Press 1. Previous Menu          2. Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> options();
            case 2 -> nokiaMenu();
        }
    }

    private static void send_BCard() {
        display("""
                Send B'Card :
                
                Press 1. Previous Menu          2. Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> phone_BooK();
            case 2 -> nokiaMenu();
        }
    }

    private static void assign_Tone() {
        display("""
                Assign Tone :
                
                Press 1. Previous Menu          2. Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> phone_BooK();
            case 2 -> nokiaMenu();
        }
    }

    private static void edit() {
        display("""
                Edit :
                
                Press 1. Previous Menu          2. Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> phone_BooK();
            case 2 -> nokiaMenu();
        }
    }

    private static void erase() {
        display("""
                Erase :
                
                Press 1. Previous Menu          2. Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> phone_BooK();
            case 2 -> nokiaMenu();
        }
    }

    private static void add_name() {
        display("""
                Add Name :
                
                Press 1. Previous Menu          2. Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> phone_BooK();
            case 2 -> nokiaMenu();
        }
    }

    private static void service_No() {
        display("""
                Service Nos. :
                
                Press 1. Previous Menu          2. Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> phone_BooK();
            case 2 -> nokiaMenu();
        }
    }

    private static void search() {
        display("""
                Search :
                Search for Phone Numbers
                
                Press 1. Previous Menu          2.Main Menu
                """);
        number = userInput.nextInt();
        switch (number) {
            case 1 -> phone_BooK();
            case 2 -> nokiaMenu();
        }
    }

    public static void display(String message) {
        System.out.println(message);

    }
}
