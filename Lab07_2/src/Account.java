import java.util.Date;

class Account {
    private String name;
    private String id;
    private double balance;
    private String[][] transactions;
    private String[][] temp;
    private Date transactionDate;
    private String dateStr;
    private String typeStr;
    private String amountStr;
    private String balanceStr;
    int size;
    public Account(String name,String id,double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.size = 0;
        transactions = new String[4][this.size];
        temp = new String[4][this.size];
    }

    //setter

    public String setName(){
        return name;
    }

    public String setId(){
        return id;
    }

    public double setBalance(){
        return balance;
    }

    //function
    public void withdraw(double withdraw){

        this.balance -= withdraw;
        transactionDate = new Date();
        dateStr = transactionDate.toString();
        typeStr = new String("W");
        amountStr = String.format("%.2f", withdraw);
        balanceStr = String.format("%.2f", balance);
        if(this.balance<0){
            this.balance+=withdraw;
            typeStr = new String("ERROR");
            amountStr = new String("ERROR");
            balanceStr = new String("ERROR");
        }
        saveTransactions(dateStr, typeStr, amountStr, balanceStr);
    }

    public void deposit(double deposit){
        this.balance += deposit;
        transactionDate = new Date();
        dateStr = transactionDate.toString();
        typeStr = new String("D");
        amountStr = String.format("%.2f", deposit);
        balanceStr = String.format("%.2f", balance);
        saveTransactions(dateStr, typeStr, amountStr, balanceStr);
    }

    public void saveTransactions(String currentDate,String type,String amount,String balanceLeft){
        temp = new String[4][size];
        for(int i=0;i<4;i++){
            for(int j=0;j<size;j++){
                temp[i][j]=transactions[i][j];
            }
        }
        size++;
        transactions = new String[4][size];
        for(int i=0;i<4;i++){
            for(int j=0;j<size;j++){
                if(j==size-1){
                    if(i==0) transactions[i][j] = currentDate;
                    else if(i==1) transactions[i][j] = type;
                    else if(i==2) transactions[i][j] = amount;
                    else if(i==3) transactions[i][j] = balanceLeft;
                }
                else transactions[i][j] = temp[i][j];
            }
        }
    }


    //getter
    public void getName(String name){
        this.name = name;
    }

    public void getId(String id){
        this.id = id;
    }

    public void getBalance(double balance){
        this.balance = balance;
    }

    //render
    public void showTransactions(){
        System.out.println("Name: "+name);
        System.out.println("Account ID: "+id);
        System.out.println("Annual interest rate: 1.65");
        System.out.printf("Balance: %.2f\n",balance);
        System.out.println("Date\t\t\t\tType\t\tAmount\t\tBalance");
        for(int i=0;i<size;i++){
            for(int j=0;j<4;j++){
                System.out.print(transactions[j][i]);
                if(j==0) System.out.print("\t");
                else if(j==1 || j==2 || j==3) System.out.print("\t\t"); 
            }
            System.out.println();
        }
    }
}