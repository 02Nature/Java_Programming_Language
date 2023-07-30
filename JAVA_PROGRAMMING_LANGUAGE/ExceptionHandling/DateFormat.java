import java.util.*;
import java.text.SimpleDateFormat;
public class DateFormat 
{
    static void dateConvertion(String inpt)
    {
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd//mm//yyyy");
            Date date = sdf.parse(inpt);
            SimpleDateFormat outpt = new SimpleDateFormat("yyyy-mm-dd");
            String uotDate = outpt.format(date);
            System.out.println("new formart: "+uotDate);
        }
        catch(java.text.ParseException e)
        {
            System.out.println("erro out");

        }
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter date in dd//mm/yyyy format");
            String inputDate = scanner.nextLine();
            dateConvertion(inputDate);
        }
        
    }
    

