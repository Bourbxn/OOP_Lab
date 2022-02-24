import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Filling Status");
        System.out.println("    [0]-Single Filer");
        System.out.println("    [1]-Married jointly or qualifying widow(er)");
        System.out.println("    [2]-Married separately");
        System.out.println("    [3]-Single Head of household");
        System.out.print("Enter the filling status: ");
        int status = scanner.nextInt();
        System.out.print("Enter the taxable income: ");
        double amount = scanner.nextInt();
        if((status<0 || status>3) ||(amount<0)){
            System.out.println("INPUT ERROR!");
            System.exit(0);
        }
        ComputeTax computeTax = new ComputeTax(status,amount); 
        System.out.printf("Tax is %.2f",computeTax.getTax());
    }
}
