public class Inheritance 
{
     class ParentClass
    {
        public void init()
        {
            System.out.println("Parent class executed");
        }
    }
     
     class ChildOne extends ParentClass
    {
        public void start()
        {
            System.out.println("Child ckass executed");
        }
    }
    public static void main(String[] args) 
    {
        Inheritance myObj = new Inheritance();
        ParentClass parentObj = myObj.new ParentClass();
        parentObj.init();

        ChildOne childObj = myObj.new ChildOne();
        childObj.start();  
    }
}
