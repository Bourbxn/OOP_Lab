class BMI {
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;
    private double bmi;
    private String interpretation;

    public BMI(String name, int age, double weight, double feet,  double inches){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }    

    public void displayBMI(){
        bmi = (weight/((feet*12+inches)*(feet*12+inches)))*703;
        interpretation = "";
        if(bmi<18.5) interpretation+="Underweight";
        else if(bmi>=18.5 && bmi<25.0) interpretation+="Normal";
        else if(bmi>=25.0 && bmi<30.0) interpretation+="Overweight";
        else if(bmi>=30.0) interpretation+="Obese";
        System.out.printf("BMI is %.2f, You are "+interpretation+".",bmi);
    }
}
