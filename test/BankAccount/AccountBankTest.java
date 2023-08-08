package BankAccount;

import Method.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountBankTest {
    AccountBank accountBank = new AccountBank("Godfrey", "1111"
    );

    @Test
    public void accountExistTest() {
        assertNotNull(accountBank);
    }

    @Test
    public void DepositTest() {
        accountBank.depositCash(10000);
        assertEquals(10000, accountBank.checkBalance("1111"));
    }

    @Test
    public void cashWithdrawalTest() {
        accountBank.depositCash(10000);
        accountBank.withdrawCash("1111", 3000);
        accountBank.withdrawCash("1111", 5000);
        assertEquals(2000, accountBank.checkBalance("1111"));
    }

    @Test
    public void wrongPinTest() {
        accountBank.depositCash(10000);
        accountBank.withdrawCash("1234", 3000);
        assertEquals(0, accountBank.checkBalance("1234"));
    }

    @Test
    public void depositNegativeAmountTest() {
        accountBank.depositCash(-10000);
        assertEquals(0, accountBank.checkBalance("1111"));
    }

    @Test
    public void withdrawNegativeAmountTest() {
        accountBank.depositCash(10000);
        accountBank.withdrawCash("1111", -5000);
        assertEquals(10000, accountBank.checkBalance("1111"));
    }

    @Test
    public void withdrawAboveBalanceTest() {
        accountBank.depositCash(10000);
        accountBank.withdrawCash("1111", 20000);
        assertEquals(10000, accountBank.checkBalance("1111"));
    }
    @Test
    public void negativeAmountAboveBalanceTest() {
        accountBank.depositCash(-10000);
        accountBank.withdrawCash("1111", 20000);
        assertEquals(0, accountBank.checkBalance("1111"));
    }

}