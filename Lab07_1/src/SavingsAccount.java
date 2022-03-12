class SavingsAccount extends Account {
    private double overdraftLimit;

    public SavingsAccount(int id, double balance, double annualInterestRate) {
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
        String aboutBalance = new String("");
        if (getLastBalance() < 0) {
            setLastBalance(getBalance());
            aboutBalance += "WITHDRAW ERROR!\n";
            transaction = new String("");
        } else {
            aboutBalance += "Balance is " + String.format("%.2f", getLastBalance()) + "\n";
        }
        return "Checking Account\n" +
                "Overdraft Limit: " + String.format("%.2f", overdraftLimit) + "\n" +
                "Balance is " + String.format("%.2f", getBalance()) + "\n" +
                transaction +
                aboutBalance +
                "This account was created at " + String.format("%tc", getDateCreated());
    }
}
