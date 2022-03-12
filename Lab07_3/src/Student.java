class Student extends Person {
    private String status;

    public Student(String name, String address, String phoneNumber, String emailAddress,int year) {
        super(name, address, phoneNumber, emailAddress);
        this.status = new String("");
        if(year==1)this.status+=Status.FRESHMAN.getStatus();
        else if(year==2)this.status+=Status.SOPHOMORE.getStatus();
        else if(year==3)this.status+=Status.JUNIOR.getStatus();
        else if(year==4)this.status+=Status.SENIOR.getStatus();
    }

    // getter
    public String getStatus() {
        return status;
    }

    public String toString(){
        return super.toString()+"Student{status="+status+"}";
    }

    //function
    public void renderStudent(){
        System.out.println("Student");
    }
}
