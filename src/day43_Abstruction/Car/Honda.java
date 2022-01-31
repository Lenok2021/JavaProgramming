package day43_Abstruction.Car;

public  class Honda extends Car {


    public Honda(String color, String model, String make, int year, double price) {
        super(color, model, make, year, price);
    }

    @Override
    public  void start(){
        System.out.println("Twist the key to ignition");
    }
}
