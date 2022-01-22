class Stock {
    private String symbol;
    private String name;
    private Double previousClosingPrice;
    private Double currentPrice;

    public Stock(String symbol,String name,Double previousPrice,Double currentPrice){
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

    public Double getPreviousPrice(){
        return this.previousClosingPrice;
    }

    public Double getCurrentPrice(){
        return this.currentPrice;
    }

    public Double getPercentChange(){
        return ((this.currentPrice-this.previousClosingPrice)/this.currentPrice)*100;
    }
}
