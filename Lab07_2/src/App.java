public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account("George", "1122", 1000);
        account.deposit(100);
        account.withdraw(100000);
        account.deposit(30);
        account.withdraw(20);
        account.showTransactions();
    }
}
