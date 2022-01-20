import java.util.Scanner;

public class Lab02_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int day = scanner.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int dayElapsed = scanner.nextInt();
        int dayCurrent = (day + dayElapsed)%7;
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Today is "+days[day%7]+" and the future day is "+days[dayCurrent]);
    }
}
