package Method;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account( "rotimi", "rotimi@yahoo.com", 20_000);
        account.setName("timi");
        String name = account.getName();
        System.out.println(name);
        account.setEmail("timi@yahoo.com");
        String email = account.getEmail();
        System.out.println(email);
        account.setBalance(40_000);
        double balance = account.balance();
        System.out.println(balance);



    }

}
