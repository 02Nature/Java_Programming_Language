package LabExarcise;

public class UserDefinedException extends Exception
{
    int a;
    UserDefinedException(int b)
    {   super();
        a=b;
    }
    public String toString()
    {
        return ("Exception number: "+a);
    }
    class Myclass{

    public static void main(String[] args) 
    {
        try {
            throw new UserDefinedException(6);
        } catch (UserDefinedException e) {
            System.out.println(e);
        }    
    }
}
}
