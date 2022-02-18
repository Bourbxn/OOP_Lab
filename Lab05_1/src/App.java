import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Account account = new Account(1122, 20000, 4.5);
        System.out.print("Press (1) Withdraw, (2) Deposit, (3) Do nothing : ");
        int choose = scanner.nextInt();
        if(choose == 1){
            System.out.print("Amount : ");
            account.withdraw(scanner.nextDouble());
        }
        else if(choose == 2){
            System.out.print("Amount : ");
            account.deposit(scanner.nextDouble());
        }
        else if(choose == 3){
            System.out.println("END OF PROGRAM.");
            System.exit(0);
        }
        else{
            System.out.println("INPUT ERROR");
            System.exit(0);
        }
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Montly interest: " + account.getMonthlyInterest());
        System.out.println("Date created: " + account.getDateCreated());
    }
}