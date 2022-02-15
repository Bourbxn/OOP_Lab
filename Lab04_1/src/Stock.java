class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol,String name,double previousPrice,double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousPrice;
        this.currentPrice = currentPrice;
    }

    public String getSymbol(){
        return this.symbol;
    }

    public String getName(){
        return this.name;
    }

    public double getPreviousPrice(){
        return this.previousClosingPrice;
    }

    public double getCurrentPrice(){
        return this.currentPrice;
    }

    public double getPercentChange(){
        return ((this.currentPrice-this.previousClosingPrice)/this.previousClosingPrice)*100;
    }
}
