public class App {
    public static void main(String[] args) throws Exception {
        SavingsAccount savingsAccount = new SavingsAccount(1111, 5000, 0);
        savingsAccount.withdraw(10000);
        System.out.println(savingsAccount.toString());
    }
}
