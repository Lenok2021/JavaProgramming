package day43_Abstruction.Car;

public final class Honda extends Car {


    public Honda(String brand,String color, String model, String make, int year, double price) {
        super(brand,color, model, make, year, price);
    }



    public void stop(){  //  subclass responsible for implementation of method
        System.out.println("Very fast");
    }
    public  void start(){
        System.out.println("Twist the key to ignition");
    }
}
