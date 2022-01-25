import java.sql.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(int id,double balance,double annualInterestRate,Date dateCreated){ 
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
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
