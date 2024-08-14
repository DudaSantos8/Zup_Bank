import java.text.SimpleDateFormat;
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
}
