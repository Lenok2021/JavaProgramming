package day43_Abstruction.Car;

public abstract class Car {

    private final String  model, make;
    private  String color;
    private final int year;
    private double price;

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new RuntimeException("Invalid price: "+ price);
        }
        this.price = price;
    }

    public Car(String color, String model, String make, int year, double price) {
        setColor(color);
        this.model = model;
        this.make = make;
        if(year < 1886 ){
            throw new RuntimeException("Invalid Year: "+ year);
        }
        this.year = year;
        setPrice(price);
    }

    public abstract void stop();

    public abstract void start();


}
