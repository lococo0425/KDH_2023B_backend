package day20;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("account.getBalance() = " + account.getBalance());

        try {
            account.withdraw(30000);
        }catch (Exception e){
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
