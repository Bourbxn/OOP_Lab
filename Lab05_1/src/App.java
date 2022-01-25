public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account(1122, 20000, 4.5, new java.sql.Date(System.currentTimeMillis()));
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Montly interest: " + account.getMonthlyInterest());
        System.out.println("Date created: " + account.getDateCreated());
    }
}
