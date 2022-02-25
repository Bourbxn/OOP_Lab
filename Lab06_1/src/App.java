import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        double weight=0;
        double height=0;
        System.out.print("Enter name and age: ");
        String nameAndAge[] = scanner.nextLine().split(" ");
        System.out.print("Weight (input format: 1=kg 2=pound value): ");
        String typeAndWeight[] = scanner.nextLine().split(" ");
        System.out.print("Height (input format: 1=meter 2=feet-inch):");
        String typeAndHeight[] = scanner.nextLine().split(" ");
        if(Integer.parseInt(typeAndWeight[0])==1){
            weight += Integer.parseInt(typeAndWeight[1])*2.20462262185;
        }
        else if(Integer.parseInt(typeAndWeight[0])==2){
            weight += Integer.parseInt(typeAndWeight[1]);
        }
        if(Integer.parseInt(typeAndHeight[0])==1){
            height += Integer.parseInt(typeAndHeight[1])*39.3700787402;
        }
        else if(Integer.parseInt(typeAndHeight[0])==2){
            height += Integer.parseInt(typeAndHeight[2])+(Integer.parseInt(typeAndHeight[1])*12);
        }
        BMI bmi = new BMI(nameAndAge[0], Integer.parseInt(nameAndAge[1]), weight, height);
        bmi.displayBMI();

    }
}

