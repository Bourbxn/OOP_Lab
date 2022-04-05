import java.util.*;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scannerBool = new Scanner(System.in);
    static Scanner scannerStr = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.print("Enter side 1: ");
        double sideA = scanner.nextDouble();
        System.out.print("Enter side 2: ");
        double sideB = scanner.nextDouble();
        System.out.print("Enter side 3: ");
        double sideC = scanner.nextDouble();
        System.out.print("Enter color: ");
        String color = scannerStr.nextLine();
        System.out.print("Enter filled: ");
        boolean filled = scanner.nextBoolean();
        System.out.println();
        GeometricObject triangle = new Triangle(sideA,sideB,sideC,color,filled); 
        System.out.println(triangle);   
    }
}
