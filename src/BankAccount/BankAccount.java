package BankAccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private List<AccountBank> accountBanks = new ArrayList<>();
    public void createAccount(String name, String pin) {
        String accountNumber = "11223344556" + accountBanks.size();
        AccountBank accountBank = new AccountBank(name, pin);
        accountBank.setAccountNumber(accountNumber);
        accountBanks.add(accountBank);
    }
    public int sizeOfAccountsInBanks() {
        return accountBanks.size();
    }
    public void depositToAccount(String accountNumber, double amount) {
        AccountBank accountBank = findAccountByAccountNumber(accountNumber);
        accountBank.depositCash(amount);
    }
    public double checkAccountBalance(String accountNumber, String pin) {
        AccountBank accountBank = findAccountByAccountNumber(accountNumber);
        return accountBank.checkBalance(pin);
    }
    private AccountBank findAccountByAccountNumber(String accountNumber){
        for (AccountBank accountBank : accountBanks)
            if (accountBank.getAccountNumber().equals(accountNumber))
                return accountBank;
        throw new NullPointerException("Account does not exist");
    }

    public void withdrawFromAccount(String accountNumber, double amount, String pin) {
        for (AccountBank accountBank : accountBanks)
            if (accountBank.getAccountNumber().equals(accountNumber))
                accountBank.withdrawCash(pin, amount);
    }

    public void TransferFromAccountToAccount(String senderAccountNumber, double amount, String pin, String receiverAccountNumber) {
        withdrawFromAccount(senderAccountNumber, amount, pin);
        depositToAccount(receiverAccountNumber, amount);
    }


    public String getAccountNumber() {
        return null;
    }
}
