package day38_Inheritance.carTask_Overidding;

public class Tesla extends Car {
    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);

    }
    public void spacing(){
        System.out.println(brand + " "+ model + " is spacing");
    }

    @Override
    public void start() {
        System.out.println("Starting very fast "+ brand+ " "+model);
    }
}
