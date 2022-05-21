abstract class Beverage {
    private int price;
    private String name;

    public abstract int getCost();

    public Beverage(){
        this.price = 0;
        this.name = "null";
    }

    public Beverage(int price, String name){
        this.price = price;
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "Price :" + String.valueOf(price) + "\n" +
             "Name :" + name + "\n";
    }

    public void editPrice(int price) {
        this.price += price;
    }
}
