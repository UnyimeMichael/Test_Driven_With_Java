package Methods;

import com.sun.source.tree.ReturnTree;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        System.out.println("The decimal value for hex number" + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int index = 0 ; index < hex.length(); index++){
            char hexChar = hex.charAt(index);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch){
        if(ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else return ch - '0';
    }
}
