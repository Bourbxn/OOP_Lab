import java.sql.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new java.sql.Date(System.currentTimeMillis());
    }

    public Account(int id,double balance,double annualInterestRate){ 
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new java.sql.Date(System.currentTimeMillis());;
    }

    public Double getMonthlyInterestRate(){
        return this.annualInterestRate/12;        
    }

    public Double getMonthlyInterest(){
        return (this.annualInterestRate/12)*this.balance;
    }

    public Double getBalance(){
        return this.balance + ((this.annualInterestRate/100)*this.balance);
    }

    public Date getDateCreated(){
        return this.dateCreated;
    }

    public void withdraw(double withdraw){
        this.balance -= withdraw;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }
}
