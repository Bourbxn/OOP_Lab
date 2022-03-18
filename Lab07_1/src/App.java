public class App {
    public static void main(String[] args) throws Exception {
        SavingsAccount savingsAccount = new SavingsAccount(1111, 5000, 0);
        savingsAccount.withdraw(10000);
        System.out.println(savingsAccount);

        System.out.println();

        CheckingAccount checkingAccount = new CheckingAccount(1111, 5000, 0,5000);
        checkingAccount.withdraw(10001);
        System.out.println(checkingAccount);
    }
}
