package LabExarcise;
public class Exception {
    public static void main(String[] args) {
        try
        {
            int a = 3, b= 0;
        System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cant solve");
        }
        try 
        {
          int num = Integer.parseInt("jr");
        } 
        catch (NumberFormatException e) {
           
            System.out.println("Number Format Exception");
        }
        int[] num = new int[5];
        
        try 
        {
            num[8]= 8;
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array out of bound exception");
        }
        finally
        {
            System.out.println("working with exception");
        }
        avg();
    }
    static void avg()
        {
            try
            {
                throw new ArithmeticException("jr");
            }
            catch(ArithmeticException o)
            {
                System.out.println("exception caught");
            }
            try
            {
                avg1();
            }
            finally
            {
                System.out.println("done");
            }
        }
        static void avg1() throws ArithmeticException
        {
            System.out.println("Inside the avg1 method");
            throw new ArithmeticException("jr");
            
        }
    
}
