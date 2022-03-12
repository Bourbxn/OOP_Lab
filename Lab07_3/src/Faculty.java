class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress,
    	String office, double salary, String dateHired,int officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office,salary,dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // getter

    public int getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public String toString(){
    	return super.toString() + "Faculty{officeHours="+officeHours+", "+
		"rank="+rank+"}";
    }

    //function
     public void renderFaculty(){
        System.out.println("Faculty");
    }
}
