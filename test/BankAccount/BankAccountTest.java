package BankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    BankAccount bankAccount;
    @BeforeEach void startsWith(){
        bankAccount = new BankAccount();
    }
    @Test public void objectOfBankAccountExist() {
        assertNotNull(bankAccount);
    }
    @Test public void bankCanCreateAccount(){
        bankAccount.createAccount("Dele","1234");
        assertEquals(1, bankAccount.sizeOfAccountsInBanks());
    }
    @Test public void bankCanCreateMultipleAccounts(){
        bankAccount.createAccount("Dele","1234");
        bankAccount.createAccount("Dele","1234");
        bankAccount.createAccount("Dele","1234");
        bankAccount.createAccount("Dele","1234");
        bankAccount.createAccount("Dele","1234");
        assertEquals(5, bankAccount.sizeOfAccountsInBanks());
    }
    @Test public void bankCanDepositToAccount(){
        bankAccount.createAccount("Dele","1234");
        bankAccount.depositToAccount("112233445560", 2000);
        assertEquals(1,bankAccount.sizeOfAccountsInBanks());
        assertEquals(2_000, bankAccount.checkAccountBalance("112233445560", "1234"));
    }
    @Test public void depositMultipleTimesToAccount(){
        bankAccount.createAccount("Dele","1234");
        bankAccount.depositToAccount("112233445560", 2000);
        bankAccount.depositToAccount("112233445560", 2000);
        assertEquals(1,bankAccount.sizeOfAccountsInBanks());
        assertEquals(4_000, bankAccount.checkAccountBalance("112233445560", "1234"));
    }
    @Test public void withdrawFromAccount(){
        bankAccount.createAccount("mike", "1111");
        bankAccount.depositToAccount("112233445560", 3000);
        bankAccount.withdrawFromAccount("112233445560", 1500, "1111");
        assertEquals(1500, bankAccount.checkAccountBalance("112233445560", "1111"));
    }
    @Test public void withdrawMultipleTimesFromAccount(){
        bankAccount.createAccount("mike", "1111");
        bankAccount.depositToAccount("112233445560", 5000);
        bankAccount.withdrawFromAccount("112233445560", 1500, "1111");
        bankAccount.withdrawFromAccount("112233445560", 1000, "1111");
        bankAccount.withdrawFromAccount("112233445560", 1500, "1111");
        assertEquals(1000, bankAccount.checkAccountBalance("112233445560", "1111"));
    }
    @Test public void TransferCashWithinTheSameBank(){
        bankAccount.createAccount("mike", "1111");
        bankAccount.depositToAccount("112233445560", 5000);
        assertEquals(5000, bankAccount.checkAccountBalance("112233445560", "1111"));
        bankAccount.createAccount("dele", "2222");
        bankAccount.depositToAccount("112233445561", 500);
        assertEquals(500, bankAccount.checkAccountBalance("112233445561", "2222"));
        assertEquals(2,bankAccount.sizeOfAccountsInBanks());
        bankAccount.TransferFromAccountToAccount("112233445560", 2000, "1111","112233445561");
        assertEquals(3000, bankAccount.checkAccountBalance("112233445560", "1111"));
        assertEquals(2500, bankAccount.checkAccountBalance("112233445561", "2222"));
    }
}
