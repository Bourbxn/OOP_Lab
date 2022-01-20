import java.util.Scanner;

public class Lab02_4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the first city: ");
        String firstCity = scanner.nextLine();
        System.out.print("Enter the second city: ");
        String secondCity = scanner.nextLine();
        System.out.print("Enter the third city: ");
        String thirdCity = scanner.nextLine();
        String first = firstCity;
        String second = secondCity;
        String third = thirdCity;
        if(firstCity.compareToIgnoreCase(secondCity)<=0 && firstCity.compareToIgnoreCase(thirdCity)<=0){
            first = firstCity;
            firstCity = secondCity;
            secondCity = thirdCity;
        }
        else if(secondCity.compareToIgnoreCase(firstCity)<=0 && secondCity.compareToIgnoreCase(thirdCity)<=0){
            first = secondCity;
            secondCity = thirdCity; 
        }
        else if(thirdCity.compareToIgnoreCase(firstCity)<=0 && thirdCity.compareToIgnoreCase(secondCity)<=0){
            first = thirdCity;
        }
        if(firstCity.compareToIgnoreCase(secondCity)<=0){
            second = firstCity;
            third = secondCity;
        }
        else{
            second = secondCity;
            third = firstCity;
        }
        System.out.println("The three cities in alphabetical order are " + first + " " + second + " " + third);
    }
}