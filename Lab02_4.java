import java.util.Scanner;

public class Lab02_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
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
        System.out.println(first + second + third);
    }
}

/*

Enter the first city: Chicago <Enter>
Enter the second city: Los Angeles <Enter>
Enter the third city: Atlanta <Enter>
The three cities in alphabetical order are Atlanta Chicago Los Angeles

 */