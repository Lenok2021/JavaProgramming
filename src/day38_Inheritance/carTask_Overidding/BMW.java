package day38_Inheritance.carTask_Overidding;

public class BMW extends Car{
    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);




    }
    public void breakDown(){
        System.out.println(brand + " "+ model + " is breaking");
    }
    public void racing(){
        System.out.println(brand + " "+ model + " is racing");
    }

    @Override
    public void start() {
        System.out.println("Car mechanic to jump start " + brand+ " "+model);
    }
}
/*
  BMW  :  has  extra methods
  breakDown()
  racing()

   */
