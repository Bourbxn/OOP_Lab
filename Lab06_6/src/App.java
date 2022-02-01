import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static int id;
    public static Account[] accounts = new Account[10];
    public static boolean login = false;
    public static void main(String[] args) throws Exception {
        for(int i=0;i<10;i++) accounts[i] = new Account();
        while(true){
            renderATM();
        }
    }

    public static void renderATM(){
        if(!login){
            System.out.print("Enter an id: ");
            id = scanner.nextInt();
            if(id>=10 || id<0) System.out.println("INPUT ERROR!\n");
            else {
                System.out.println();
                login = true;   
            }
        }
        else{
            System.out.println("Main Menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            System.out.print("Enter a choice: ");
            int choice = scanner.nextInt();
            choiceSelection(choice);
        }
    }

    public static void choiceSelection(int choice){
        if(choice==1) {
            System.out.println("The balance is "+ accounts[id].checkBalance());
            System.out.println();
        }
        else if(choice==2){
            System.out.print("Enter an amout to withdraw: ");
            double amount = scanner.nextDouble();
            accounts[id].withdraw(amount);
            System.out.println();
        }
        else if(choice==3){
            System.out.print("Enter an amout to deposit: ");
            double amount = scanner.nextDouble();
            accounts[id].deposit(amount);
            System.out.println();
        }
        else if(choice==4){
            System.out.println("End of Program.\n");
            login = false;
        }
        else System.out.println("INPUT ERROR!\n");
    }
}
