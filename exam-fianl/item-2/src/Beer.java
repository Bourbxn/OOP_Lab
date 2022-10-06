public class Beer extends Beverage implements Time{
    private int degree;
    private String brand;

    public Beer(){
        this.degree = 0;
        this.brand = "null";
    }

    public Beer(int price, String brand, int degree) {
        super(price, "Beer");
        this.degree = degree;
        this.brand = brand;
    }

    public void setDegree(int degree){
        this.degree = degree;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getDegree(){
        return degree;
    }

    public String getBrand(){
        return brand;
    }

    public String toString(){
        return super.toString() + "Brand :" + brand + "\n" +
             "degree :" + String.valueOf(degree) + "\n";
    }

    @Override
    public int getCost() {
        return (int)(super.getPrice()*0.7);
    }

    @Override
    public String timeToSell() {
        return "15.00-00.00";
    }
}
