
public class StudentID extends Abstract
{
    private int student;
    public StudentID(String nam, String gen, int id)
    {
        super(nam, gen);
        this.student = id;
    }
    @Override
    public void Studying()
    {
        if(student==0)
            System.out.println("Not Studying");
        else
            System.out.println("Persuing the CEIT");
    }
    public static void main(String[] args) 
    {
        Abstract instant = new StudentID("Juma", "Male" , 23);
        Abstract instant1 = new StudentID("Waziri", "Male" , 0);
        Abstract instant2 = new StudentID("Rubea", "Male" , 23);
        Abstract instant3 = new StudentID("Hamad", "Male" , 0);
        Abstract instant4 = new StudentID("Zainab", "Female" , 23);
        instant.Studying();
        instant1.Studying();
        instant2.Studying();
        instant3.Studying();
        instant4.Studying();


    }
}
