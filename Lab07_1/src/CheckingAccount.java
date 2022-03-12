class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = balance;
    }

    // getter
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public String toString() {
        String transaction = new String("");
        if (getTotalWithdraw() > 0) {
            transaction += ("Withdraw: " + String.format("%.2f", getTotalWithdraw()) + "\n");
        }
        if (getTotalDeposit() > 0) {
            transaction += ("Deposit: " + String.format("%.2f", getTotalDeposit()) + "\n");
        }
        return "Checking Account\n" +
                "Overdraft Limit: " + String.format("%.2f", overdraftLimit) + "\n" +
                "Balance is " + String.format("%.2f", getBalance()) + "\n" +
                transaction +
                "Balance is " + String.format("%.2f", getLastBalance()) + "\n" +
                "This account was created at " + String.format("%tc", getDateCreated());
    }
}
