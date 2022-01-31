package day43_Abstruction.Car;

public final class Audi extends Car{

    public Audi(String color, String model, String make, int year, double price) {
        super("Audi",color, model, make, year, price);
    }

    @Override
    public void stop() {
        System.out.println("Push the start bottom");
    }

    public  void autoPark(){

    }

    @Override
    public void start() {

    }
}
