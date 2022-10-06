class Tax {
    private double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    private int[][] brackets = {
        {8350, 33950, 82250, 171550, 372950}, 
        {16700, 67900, 137050, 20885, 372950},
        {8350, 33950, 68525, 104425, 186475}, 
        {11950, 45500, 117450, 190200, 372950}
    };
    private double amount;
    private double tax;

    public Tax(int choose,double amount){
        this.amount = amount;
        if(amount <= brackets[choose][0]){
            tax = amount*rates[0];
        }
        else if(amount <= brackets[choose][1]){
            tax = brackets[0][0] * rates[0];
            tax += (amount - brackets[0][0]) * rates[1];
        }
        else if(amount <= brackets[choose][2]){
            tax = brackets[0][0] * rates[0];
            computeEachTax(choose, 2);
            tax += (amount - brackets[0][1]) * rates[2];
        }
        else if(amount <= brackets[choose][3]){
            tax = brackets[0][0] * rates[0] ;
            computeEachTax(choose, 3);
            tax += (amount - brackets[0][2]) * rates[3];
        }
        else if(amount <= brackets[choose][4]){
            tax = brackets[0][0] * rates[0];
            computeEachTax(choose, 4);
            tax += (amount - brackets[0][3]) * rates[4];
        }
        else if(amount > brackets[choose][4]){
            tax = brackets[0][0] * rates[0] ;
            computeEachTax(choose, 5);
            tax += (amount- brackets[0][4]) * rates[5];
        }
    }

    //setter
    public void setAmount(int amount){
        this.amount = amount;
    }

    public void setTax(double tax){
        this.tax = tax;
    }

    //getter
    public double getAmount(){
        return amount;
    }

    public double getTax(){
        return tax;
    }

    //function
    public void computeEachTax(int choose,int bracketsSelected){
        tax = brackets[0][0] * rates[0];
        for(int i=0;i<bracketsSelected-1;i++){
            tax += (brackets[0][i+1] - brackets[0][i]) * rates[i+1];
        }
    }
}
