package tddClass;

public class PetrolPurchase {
    private  String petrolType;
    private  int quantity;
    private  double price;
    private  double discount;
    private  String location;

    public PetrolPurchase(String location, String petrolType, int quantity, double price, double discount)
    {
        this.location = location;
        this .petrolType = petrolType;
        this.quantity = quantity;
        this.price = price;
        this. discount = discount;
    }


    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getLocation()
    {
        return location;
    }

    public void setPetrolType(String petrol)
    {
        this.petrolType= petrol;

    }

    public String getPetrolType()
    {
        return petrolType;
    }

    public void setPetrolQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getPetrolQuantity()
    {
        return quantity;
    }

    public void setPetrolPrice(double price)
    {
       this.price = price;
    }

    public double getPetrolPrice()
    {
        return price;
    }


    public void setDiscount(double percent)
    {
        this.discount = (percent * 0.01) * getPetrolPrice();
    }

    public double getDiscount()
    {
        return discount;
    }

    public  double getPurchaseAmount()
    {
        return getPetrolPrice() * getPetrolQuantity();

    }


    public double getNetAmount()
    {
        return getPurchaseAmount() - getDiscount();
    }
}
