import java.util.Scanner;

public class Lab02_1_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int day = scanner.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int dayElapsed = scanner.nextInt();
        int dayCurrent = (day + dayElapsed)%7;
        System.out.print("Today is ");
        if(day == 0){
            System.out.print("Sunday");
        }
        else if(day == 1){
            System.out.print("Monday");
        }
        else if(day == 2){
            System.out.print("Tuesday");
        }
        else if(day == 3){
            System.out.print("Wednesday");
        }
        else if(day == 4){
            System.out.print("Thursday");
        }
        else if(day == 5){
            System.out.print("Friday");
        }
        else if(day == 6){
            System.out.print("Saturday");
        }

        System.out.print(" and the future day is ");
        if(dayCurrent == 0){
            System.out.print("Sunday");
        }
        else if(dayCurrent == 1){
            System.out.print("Monday");
        }
        else if(dayCurrent == 2){
            System.out.print("Tuesday");
        }
        else if(dayCurrent == 3){
            System.out.print("Wednesday");
        }
        else if(dayCurrent == 4){
            System.out.print("Thursday");
        }
        else if(dayCurrent == 5){
            System.out.print("Friday");
        }
        else if(dayCurrent == 6){
            System.out.print("Saturday");
        }
    }
}
