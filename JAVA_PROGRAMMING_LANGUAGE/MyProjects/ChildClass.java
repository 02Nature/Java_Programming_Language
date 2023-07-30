import java.util.Scanner;

public class ChildClass  extends To_Do_List_Application
{
    

    public static void main(String[] args)
    {
        ChildClass childObj = new ChildClass();
        try (Scanner myScanner  = new Scanner(System.in)) 
        {
            System.out.println("\nDo you Forget your info? type \"edit\"");
            String edit = myScanner.nextLine();

            if(edit.equalsIgnoreCase("edit"))
            {
                System.out.println("Press the number for editing...."); 
                System.out.println("name: 1, Date: 2, priority: 3, status: 4");
                int indx = myScanner.nextInt();
                myScanner.nextLine();
      
                if(indx==1)
                {
                    System.out.println("Enter new name");
                    String newName = myScanner.nextLine();
                    mArrayList.set(0, newName);
                }

                else if(indx==2)
                {
                    System.out.println("Enter new Date");
                    String newDate = myScanner.nextLine();
                    mArrayList.set(1, newDate);
                }

                else if(indx==3)
                {
                    System.out.println("Enter new Priority");
                    String newPriority = myScanner.nextLine();
                    mArrayList.set(2, newPriority);
                }

                else if(indx==4)
                {
                    System.out.println("Enter new Status");
                    String newStatus = myScanner.nextLine();
                    mArrayList.set(3, newStatus);
                }

                else
                {
                    System.out.print("Hello "+mArrayList.get(0)+"\nYour entrance date: "+mArrayList.get(1));
                    System.out.print("\nPriority: "+mArrayList.get(2)+"\nWork status: "+mArrayList.get(3));
                }
      
            }
        }

    }
    
}

