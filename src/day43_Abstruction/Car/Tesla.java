package day43_Abstruction.Car;

public final class Tesla extends Car{

    public Tesla(String brand, String color, String model, String make, int year, double price) {
        super(brand, color, model, make, year, price);
    }

    @Override
    public void stop() {

    }

    @Override
    public void start() {
        System.out.println("Say\"start\"");
    }

    public void autoPilot(){
        System.out.println( getBrand() + " " + getModel() + " has autoPilot");
    }


}
