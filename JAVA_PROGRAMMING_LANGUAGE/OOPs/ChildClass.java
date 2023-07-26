class ChildClass extends AdvancedInheritance
{
    public String brand;

    ChildClass()
    {
        System.out.println("Child class is constructed");
    }
    //method overloading
    public void setProductDetails(String name, int productID, double price, String brand)
    {
        this.name = name;
        this.productID = productID;
        this.price = price;
        this.brand = brand;
    }
    //method overriding
    public void showProductDetails()
    {
        System.out.println("---------"+name+"--------");
        System.out.println("Product Number: "+productID);
        System.out.println("Product price: "+price);
        System.out.println("Brand name: "+brand);
    }





    public static void main(String[] args) 
    
    {
        ChildClass firstObj = new ChildClass();
        firstObj.setProductDetails("Lenovo", 1234, 23009, "Ram 24");
        firstObj.showProductDetails();
    }
    
}
