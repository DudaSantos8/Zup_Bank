import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateManipulator {

    public static Date createDateByString(String dateString){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try{
            date = sdf.parse(dateString);

        }catch (Exception e){
            System.out.println("não deu certo");
        }
        return date;
    }

    public static int getMonthDifferenceOfTwoDates(Date actualDate, Date futureDate){
        Calendar actualCalendar = Calendar.getInstance();
        Calendar futureCalendar = Calendar.getInstance();

        actualCalendar.setTime(actualDate);
        futureCalendar.setTime(futureDate);

        int actualMont = actualCalendar.get(Calendar.MONTH);
        int actualYears = actualCalendar.get(Calendar.YEAR);

        int futureMont = futureCalendar.get(Calendar.MONTH);
        int futureYears = futureCalendar.get(Calendar.YEAR);

        return (futureYears - actualYears) * 12 + (futureMont - actualMont);
    }
}
