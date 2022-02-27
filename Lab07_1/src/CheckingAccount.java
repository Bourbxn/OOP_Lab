class Checking extends Account{
    private double overdraftLimit;
    private String overdraftLimitStr;
    public Checking(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }

    //setter
    public void setOverdraftLimit(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
        overdraftLimitStr = String.format("Overdraft Limit: %.2f",overdraftLimit);
    }

    //getter
    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    //function
    public String toString(){
        return overdraftLimitStr;
    }
}
