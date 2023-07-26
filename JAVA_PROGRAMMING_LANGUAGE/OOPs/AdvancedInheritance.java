public class AdvancedInheritance
{
    String name;
    int productID;
    double price;

     AdvancedInheritance()
    {
        System.out.println("Product class is constructed");
    }
    public void setProductDetails(String name, int productID, double price)
    {
        this.name = name;
        this.productID = productID;
        this.price = price;
    }
    
    public void showProductDetails()
    {
        System.out.println("---------"+name+"--------");
        System.out.println("Product Number: "+productID);
        System.out.println("Product price: "+price);
    }

   

}
