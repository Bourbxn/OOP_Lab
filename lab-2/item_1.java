import java.util.Scanner;

public class Lab02_1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        boolean inputError = false;
        System.out.print("Enter today's day: ");
        int day = scanner.nextInt();
        if(day<0 || day>6) inputError = true;
        System.out.print("Enter the number of days elapsed since today: ");
        int dayElapsed = scanner.nextInt();
        int dayCurrent = (day + dayElapsed)%7;
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        if(inputError) System.out.println("INPUT ERROR!");
        else System.out.println("Today is "+days[day%7]+" and the future day is "+days[dayCurrent]);
    }
}
