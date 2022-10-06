public class Soda extends Beverage{
    private int sugarLevel;
    private int sparklingLevel;

    public Soda(){
        this.sugarLevel = 0;
        this.sparklingLevel = 0;
    }

    public Soda(int price, String name, int sugarLevel, int sparklingLevel) {
        super(price, name);
        this.sugarLevel = sugarLevel;
        this.sparklingLevel = sparklingLevel;
    }

    public void setSugarLevel(int sugarLevel){
        this.sugarLevel = sugarLevel;
    }

    public int getSugarLevel(){
        return sugarLevel;
    }

    public void setSparklingLevel(int sparklingLevel){
        this.sparklingLevel = sparklingLevel;
    }

    public int getSparklingLevel(){
        return sparklingLevel;
    }

    public String toString(){
        return super.toString() + "Sugar level :" + sugarLevel + "\n" +
             "Sparkling level :" + sparklingLevel + "\n";
    }

    @Override
    public int getCost() {
        return (int)(super.getPrice()*0.6);
    }
    
}
