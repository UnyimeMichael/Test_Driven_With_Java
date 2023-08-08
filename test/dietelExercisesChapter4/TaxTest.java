package dietelExercisesChapter4;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxTest {
    Tax tax = new Tax();
    Scanner input = new Scanner(System.in);

    @Test
    public void testFor15PercentTax(){
        //System.out.println("Enter Name: ");
        tax.setTax(30_000);
        tax.getTax();
        assertEquals(4500, tax.getTax());
    }

    @Test
    public void testFor20PercentTax(){
        tax.setTax(50_000);
        tax.getTax();
        assertEquals(10000, tax.getTax());
    }
}
