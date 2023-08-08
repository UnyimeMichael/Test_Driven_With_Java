import java.util.Scanner;

public class ChristmasSong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Twelve days of Christmas");
        System.out.println("First day, Second day, Third day, Fourth day, Fifth day, Sixth day, Seventh day , Eighth day, Ninth day, Tenth day, Eleventh day, Twelfth day");
        System.out.println("Enter the day");
        String day = input.nextLine();
        switch (day) {
            case "First day":
                System.out.println("""
                                    On the first day of christmas
                                    my true love sent to me
                                    a partridge in a pear tree
                                    """);
                break;
            case "Second day":
                System.out.println("""
                                    On the second day of christmas
                                    my true love sent to me
                                    Two turtle doves and a partridge in a pear tree
                                    """);
                break;
            case "Third day":
                System.out.println("""
                                    On the third day of christmas
                                    my true love sent to me
                                    three french hens
                                    Two turtle doves
                                    and a partridge in a pear tree
                                    """);
                break;
            case "Fourth day":
                System.out.println("""
                                    On the fourth day of christmas
                                    my true love sent to me
                                    four calling birds, three french hens
                                    Two turtle doves
                                    and a partridge in a pear tree
                                    """);
                break;
            case "Fifth day":
                System.out.println("""
                                    On the fifth day of christmas
                                    my true love sent to me
                                    five golden rings four calling birds
                                    three french hens
                                    Two turtle doves
                                    and a partridge in a pear tree
                                    """);
                break;
            case "Sixth day":
                System.out.println("""
                                    On the Sixth day of christmas
                                    my true love sent to me
                                    Six geese a-laying
                                    five golden rings four calling birds
                                    three french hens
                                    Two turtle doves
                                    and a partridge in a pear tree
                                    """);
                break;
            case "Seventh day":
                System.out.println("On the Seventh day of christmas, my true love sent to me ,seven swans a-swimming, Six geese a-laying , five golden rings, four calling birds, three french hens, Two turtle doves and a partridge in a pear tree");
                break;
            case "Eighth day":
                System.out.println("On the Eighth day of christmas, my true love sent to me , Eight maids a-milking, seven swans a-swimming, Six geese a-laying , five golden rings ,four calling birds, three french hens, Two turtle doves and a partridge in a pear tree");
                break;
            case "Ninth day":
                System.out.println("On the Ninth day of christmas, my true love sent to me , Nine ladies dancing, Eight maids a-milking, seven swans a-swimming, Six geese a-laying , five golden rings ,four calling birds, three french hens, Two turtle doves and a partridge in a pear tree");
                break;
            case "Ten day":
                System.out.println("On the Tenth day of christmas, my true love sent to me , Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, seven swans a-swimming, Six geese a-laying , five golden rings, four calling birds, three french hens, Two turtle doves and a partridge in a pear tree");
                break;
            case "Eleventh day":
                System.out.println("On the Eleventh day of christmas, my true love sent to me , Eleven pipers piping, Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, seven swans a-swimming, Six geese a-laying , five golden rings, four calling birds, three french hens, Two turtle doves and a partridge in a pear tree");
                break;
            case "Twelfth day":
                System.out.println("On the Twelfth day of christmas, my true love sent to me , Twelve drummers drumming, Eleven pipers piping, Ten lords a-leaping, Nine ladies dancing, Eight maids a-milking, seven swans a-swimming, Six geese a-laying , five golden rings ,four calling birds, three french hens, Two turtle doves and a partridge in a pear tree");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

    }
}
