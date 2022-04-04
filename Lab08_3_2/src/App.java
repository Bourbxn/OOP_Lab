import java.util.*;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scannerStr = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //Circle
        System.out.print("Creating circle 1, input radius: ");
        double radiusCircleA = scanner.nextDouble();
        System.out.print("Creating circle 2, input radius: ");
        double radiusCircleB = scanner.nextDouble();
        GeometricObject circleA = new Circle(radiusCircleA);
        GeometricObject circleB = new Circle(radiusCircleB);
        System.out.println("------------------------");
        max(circleA,circleB);
        System.out.println("========================");
        //Rectangle
        System.out.print("Creating rectangle 1, input width and height: ");
        String[] WHRectangleA = scannerStr.nextLine().split(" ");
        System.out.print("Creating rectangle 2, input width and height: ");
        String[] WHRectangleB = scannerStr.nextLine().split(" ");
        GeometricObject RectangleA = new Rectangle(Double.parseDouble(WHRectangleA[0]),Double.parseDouble(WHRectangleA[1]));
        GeometricObject RectangleB = new Rectangle(Double.parseDouble(WHRectangleB[0]),Double.parseDouble(WHRectangleB[1]));
        max(RectangleA,RectangleB);
        System.out.println("========================");
    }

    public static void max(GeometricObject o1, GeometricObject o2) {
      if(o1.getArea()>o2.getArea()){
        System.out.println("The max " + o1.getType() + "'s " + o1.getMax());
      }
      else{
        System.out.println("The max "+ o2.getType() +"'s " + o2.getMax());
      }
    }

}
