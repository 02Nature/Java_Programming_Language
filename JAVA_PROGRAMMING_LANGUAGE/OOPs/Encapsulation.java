public class Encapsulation
{
    private long acc_no;
    private String name, email;
    private float wage;

    public long getAcc_no()
    {
        return acc_no;
    }
    public void setAcc_no(long acc_no)
    {
        this.acc_no = acc_no;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public float getWage()
    {
        return wage;
    }
    public void setWage(float wage)
    {
        this.wage = wage;
    }

    public static void main(String[] args) 
    {
        Encapsulation myObj = new Encapsulation();
        myObj.setName("Juma");
        myObj.setEmail("rubeajuma@gmail.com");
        myObj.setAcc_no(711243432);
        myObj.setWage(25000);
        System.out.println("UserName: "+myObj.getName()+" \nEmail ID: "+myObj.getEmail());
        System.out.println("Account NO.:"+myObj.getAcc_no()+" \nWages: "+myObj.getWage());

    }
}