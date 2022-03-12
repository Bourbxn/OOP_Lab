class Employee extends Person {
	private String office;
	private double salary;
	private String dateHired;

	public Employee(String name, String address, String phoneNumber, String emailAddress,
		String office, double salary, String dateHired) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired =dateHired;
	}

	// getter
	public String getName() {
		return office;
	}

	public double getSalary() {
		return salary;
	}

	public String getDateHired() {
		return dateHired;
	}

	public String toString(){
		return super.toString() +"Employee{office="+office+", "+
		"salary="+String.format("%.2f",salary)+", "+
		"dateHired="+dateHired+"}\n";
	}

	//function

    public void renderEmployee(){
        System.out.println("Employee");
    }
}
