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
        if(firstCity.compareTo(secondCity)>0){
            System.out.println("Hello");
        }
        else if(firstCity.compareTo(secondCity)==0){
            System.out.println("dfasdf");
        }
        else {
            System.out.println("world");
        }
    }
}

/*

Enter the first city: Chicago <Enter>
Enter the second city: Los Angeles <Enter>
Enter the third city: Atlanta <Enter>
The three cities in alphabetical order are Atlanta Chicago Los Angeles

 */