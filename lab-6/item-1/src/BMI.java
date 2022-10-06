class BMI {
    private String name;
    private int age;
    private double weight;
    private double inches;
    private double bmi;
    private String interpretation;

    public BMI(String name, int age, double weight,  double inches){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.inches = inches;
    }    

    //setter

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    //getter
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    //display

    public void displayBMI(){
        bmi = (weight/((inches)*(inches)))*703;
        interpretation = "";
        if(bmi<18.5) interpretation+="Underweight";
        else if(bmi>=18.5 && bmi<25.0) interpretation+="Normal";
        else if(bmi>=25.0 && bmi<30.0) interpretation+="Overweight";
        else if(bmi>=30.0) interpretation+="Obese";
        System.out.printf("Your BMI: %.2f\n",bmi);
        System.out.println("interpretation: "+interpretation);
    }
}
