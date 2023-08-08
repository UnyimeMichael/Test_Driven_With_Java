//package Myers_Briggs;
//
//import java.util.Scanner;
//
//public class Mbti {
//    static Scanner userInput = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        display("""
//                What is your Name :
//                """);
//        name = userInput.nextLine();
//        display1("A. expend energy, enjoy groups", "        B. conserve energy, enjoy one-on-one");
//        number1("A", "B");
//        name1 = userInput.nextLine();
//        display1("A. interpret literally", "        B. look for meaning and possibilities");
//        number2("A", "B");
//        name2 = userInput.nextLine();
//        display1("A. logical, thinking, question", "        B. empathetic, feeling, accommodating");
//        number3("A", "B");
//        name3 = userInput.nextLine();
//    }
//    public static void number1(String A, String B){
//        if(name1 == A)display("A");
//        if(name1 == B)display("B");
//
//    }
//    public static void number2(String A, String B){
//        if(name2 == A)display("A");
//        if(name2 == B)display("B");
//    }
//    public static void number3(String A, String B){
//        if(name3 == A)display("A");
//        if(name3 == B)display("B");
//    }
//    private static void display1(String message1, String message2){
//        System.out.printf("%s%5s%n", message1, message2);
//    }
//    private static void display(String message){
//        System.out.println(message);
//    }
//}
