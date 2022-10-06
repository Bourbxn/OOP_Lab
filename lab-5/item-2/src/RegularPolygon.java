import java.lang.Math;

class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y; 
    }

    //Setter

    public void setN(int n){
        this.n = n;
    }

    public void setSide(double side){
        this.side = side;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    //Getter

    public double getPerimeter(){
        return side*n;
    }

    public double getArea(){
        return (n*side*side)/(4*(Math.tan(Math.PI/n)));
    }

    public int getN(){
        return n;
    }

    public double getSide(){
        return side;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }


}
