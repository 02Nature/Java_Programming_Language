package LabExarcise;

public class NewClass extends Q2
{   
    private int c = 1 ;
    NewClass(int a, int b, int c)
    {
        super(a, b);
        
        this.c = c;
        
    }
    @Override
    public int sum()
        {
            return (a+b)*c;
        }
    

public static void main(String[] args) 
{
    NewClass objClass = new NewClass(20, 3,5);
    int result = objClass.sum();
    System.out.println(result);
    
}
}
