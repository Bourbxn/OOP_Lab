import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Weight(pounds): ");
        double weight = scanner.nextDouble();
        System.out.print("Height(feet): ");
        double feet = scanner.nextDouble();
        System.out.print("Height(Inches): ");
        double inches = scanner.nextDouble();
        BMI bmi = new BMI(name, age, weight, feet, inches);
        bmi.displayBMI();
    }
}
