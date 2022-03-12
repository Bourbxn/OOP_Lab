class Staff extends Employee {
	private String title;

	public Staff(String name, String address, String phoneNumber, String emailAddress,
		String office, double salary, String dateHired,String title) {
		super(name, address, phoneNumber, emailAddress,office,salary,dateHired);
		this.title = title;
	}

	// getter

	public String getTitle() {
		return title;
	}

	public String toString(){
		return super.toString() + "Staff{title="+title+"}";
	}

	//function
	public void renderStaff(){
        System.out.println("Staff");
    }
}
