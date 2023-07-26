public abstract class Abstract
{
    private String name;
    private String gender;
    public Abstract(String nam, String gen)
    {
        this.name = nam;
        this.gender = gen;
    }
    public abstract void Studying();
    @Override
    public String toString()
    {
        return "Name"+ this.name +" Gender"+ this.gender;
    }
}