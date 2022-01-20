package homework;

public class Car {

    public String make;
    public String  model;
    public String color;
    public int year;
    public double price;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }
    public static int numberOfWheels=8;
    public static boolean hasBattery;
    public static boolean hasSeats;



    public void driving(){
        System.out.println(model+ " is driving");
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}



/*
 Car Task:
		1. Create a class called Car
            Attributes:
                 instance: make, model, color, year, price
                 static: numberOfWheels, hasBattery, hasSeats

            Add a constructor to initialize all the fields

           Methods:
                drive()
                toString()

 */