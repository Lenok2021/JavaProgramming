package day38_Inheritance.carTask;

public class Tesla extends Car{
    public Tesla( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);




    }
    public void breakDown(){
        System.out.println(brand + " "+ model + " is breaking");
    }
    public void racing(){
        System.out.println(brand + " "+ model + " is racing");
    }




}
/*
  BMW  :  has  extra methods
  breakDown()
  racing()

   */
