import java.util.Scanner;

public class Lab02_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Month: ");
        int month = scanner.nextInt();
        System.out.print("Day: ");
        int day = scanner.nextInt();

        //Check Year
        boolean inputErrorYear;
        if(year<0){
            inputErrorYear = true;
        }
        else{
            inputErrorYear = false;
        }

        //Check Month
        boolean inputErrorMonth;
        if(month<=12 && month>=1){
            inputErrorMonth = false;
        }
        else{
            inputErrorMonth = true;
        }

        //Check leap year
        boolean leapYear;
        if(year%4!=0){
            leapYear = false;
        }
        else{
            if(year%100!=0){
                leapYear = true;
            }
            else{
                if(year%400==0){
                    leapYear = true;
                }
                else{
                    leapYear = false;
                }
            }
        }

        //Check Day of Month Error
        boolean inputErrorDay;
        if((day>=1 && day<=30)&&( month==4 || month==6 || month==9 || month==11 )){
            inputErrorDay = false;
        }
        else if((day>=1 && day<=31)&&( month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)){
            inputErrorDay = false;
        }
        else if((day>=1 && day<=28)&&( month==2)){
            inputErrorDay = false;
        }
        else if(day==29 && leapYear &&( month==2)){
            inputErrorDay = false;
        }
        else{
            inputErrorDay = true;
        }

        //Calculate
        int dayOfWeek = (day +( (26*(month+1)) / 10 ) + ((year%100)/4) + ((year/100)/4) + (((year/100)/4)*5) + (year%100))%7;
        String[] days = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"}; //Ask TA
        if(inputErrorDay || inputErrorMonth || inputErrorYear){
            System.out.println("INPUT ERROR!");
        }
        else{
            System.out.println("The name of the day of the week is "+ days[dayOfWeek]);
        }
    }
}

