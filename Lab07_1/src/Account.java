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

    //Setter

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(Date dateCreated){
        this.dateCreated = dateCreated;
    }

    //Getter

    public Double getMonthlyInterestRate(){
        return this.annualInterestRate/12;        
    }

    public Double getMonthlyInterest(){
        return ((this.annualInterestRate/12)*this.balance)/100;
    }

    public Double getBalance(){
        return this.balance + ((this.annualInterestRate/100)*this.balance);
    }

    public Date getDateCreated(){
        return this.dateCreated;
    }

    public int getID(){
        return this.id;
    }

    //Method

    public void withdraw(double withdraw){
        if(withdraw<0){
            System.out.println("INPUT ERROR");
        }
        else{
            this.balance -= withdraw;
        }
    }

    public void deposit(double deposit){
        if(deposit<0){
            System.out.println("INPUT ERROR");
        }
        else{
            this.balance += deposit;
        }   
    }
}
