package BankAccount;

public class AccountBank {
    private String name;
    private String pin;
    private double balance;
    private String accountNumber;
    public AccountBank(String name, String pin){
        this.name = name;
        this.pin = pin;
    }

    public void depositCash(double amount) {
        if (amount > 0) balance = balance + amount;
//        System.out.println("Invalid Amount");
    }

    public double checkBalance(String pin) {
        if (this.pin.equals(pin)) return balance;
        else return 0;
    }
    public void withdrawCash(String pin, double amount) {
        if (this.pin.equals(pin) && amount > 0 && amount < balance) balance = balance - amount;
//        else System.out.println("Wrong Pin, Please ENTER the correct Pin");
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
}
