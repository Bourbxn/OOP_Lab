import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) throws Exception {
        GregorianCalendar greCal = new GregorianCalendar(2021,0,31);
        System.out.println("current year, month, date, and day of week");
        System.out.println("Year is " + greCal.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + greCal.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + greCal.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + greCal.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("------------");
        System.out.println("After specified the elapsed time of one day after current day");
        greCal.setTimeInMillis(greCal.getTimeInMillis()+(3600000*24));
        System.out.println("Year is " + greCal.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + greCal.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + greCal.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + greCal.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(greCal.getTime());
    }
}