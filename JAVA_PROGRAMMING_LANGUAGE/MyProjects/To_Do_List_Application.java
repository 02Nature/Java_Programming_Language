
import java.util.*;

public class To_Do_List_Application
{
    static ArrayList<String> mArrayList = new ArrayList<String>(); 
    
      
    
   public To_Do_List_Application() 
    {
          try (Scanner myScanner = new Scanner(System.in)) 
          {
               System.out.print("Enter your name: ");
               String name = myScanner.nextLine();

               System.out.print("Enter your date of work: ");
               String date = myScanner.nextLine();

               System.out.print("Enter your priority activity of work: ");
               String priority = myScanner.nextLine();

               System.out.print("Enter your status of work: ");
               String status = myScanner.nextLine();

               mArrayList.add(name);
               mArrayList.add(date);
               mArrayList.add(priority);
               mArrayList.add(status);
          }
    }
}
    

