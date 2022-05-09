package tddClass;

public class CarApplication {

    private String model;
    private String year;
    private double price;
    private int count;
    private double discount;

    public CarApplication(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
         count++;
    }

    public void setModel(String model) {
        this.model = model;
        count++;
    }

    public String getModel(){

        return model;
    }

    public void setYear(String year) {
        this.year = year;
        count++;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        count++;
        }
        else this.price = 0;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setDiscount(int percent){
       discount=  (percent * 0.01) * getPrice();
    }
    public double getDiscount() {
        return discount;
    }
}
