public class App {
    public static void main(String[] args) throws Exception {
        Stock stock = new Stock("ORCL", "Oracle Coperation", 34.5, 34.35);
        System.out.println("Symbol: " + stock.getSymbol());
        System.out.println("Name: " + stock.getName());
        System.out.println("Previous Closing Price: " + stock.getPreviousPrice());
        System.out.println("Current Price: " + stock.getCurrentPrice());
        System.out.println("Price Change: " + stock.getPercentChange() + " %");
    }
}
