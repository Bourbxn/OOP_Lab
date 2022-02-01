class Account {
    private double balance;
    
    public Account(){
        this.balance = 100.00;
    }

    public void withdraw(double withdraw){
        balance -= withdraw;
    }

    public void deposit(double deposit){
        balance += deposit;
    }

    public double checkBalance(){
        return balance;
    }
}
