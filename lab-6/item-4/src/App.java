import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    static int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950}, 
            {16700, 67900, 137050, 20885, 372950},
            {8350, 33950, 68525, 104425, 186475}, 
            {11950, 45500, 117450, 190200, 372950}
        };
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
        System.out.printf("Tax is %.2f",Tax(status, amount));
    }

    public static double Tax(int status,double amount){
        double tax = 0;
        if(amount <= brackets[status][0]){
            tax = amount*rates[0];
        }
        else if(amount <= brackets[status][1]){
            tax = brackets[0][0] * rates[0];
            tax += (amount - brackets[0][0]) * rates[1];
        }
        else if(amount <= brackets[status][2]){
            tax += computeEachTax(status, 2)+ ((amount - brackets[0][1]) * rates[2]);
        }
        else if(amount <= brackets[status][3]){
            tax += computeEachTax(status, 3) + ((amount - brackets[0][2]) * rates[3]);
        }
        else if(amount <= brackets[status][4]){
            tax += computeEachTax(status, 4) + ((amount - brackets[0][3]) * rates[4]);
        }
        else if(amount > brackets[status][4]){
            tax += computeEachTax(status, 5) + ((amount- brackets[0][4]) * rates[5]);
        }
        return tax;
    }

    public static double computeEachTax(int status,double bracketsSelected){
        double taxPlus = 0;
        taxPlus = brackets[0][0] * rates[0];
        for(int i=0;i<bracketsSelected-1;i++){
            taxPlus += (brackets[0][i+1] - brackets[0][i]) * rates[i+1];
        }
        return taxPlus;
    }
}
