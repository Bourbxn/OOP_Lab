class Square extends GeometricObject implements Colorable{
	private double side;

	public Square(double side){
		this.side = side;
	}

	public Square(double side,String color,boolean filled){
		super(color,filled);
		this.side = side;
	}

	@Override
	public void howToColor(){
		System.out.println("Color all four sides.");
	}

	@Override
	public double getArea(){
		return side*side;
	}

	@Override
	public double getPerimeter(){
		return side*4;
	}

	//getter

	public double getSide(){
		return side;
	}

	@Override
	public String toString(){
		return super.toString() + "\nSide: " + side +
		"\nPerimeter: " + String.format("%.2f",getPerimeter()) +
		"\nArea: " + String.format("%.2f",getArea());
	}
}