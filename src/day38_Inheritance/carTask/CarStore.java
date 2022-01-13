package day38_Inheritance.carTask;

public class CarStore {
     public static void main(String[] args) {
          Tesla tesla = new Tesla("Extra", 2010,123000.0,"Back",123);
          System.out.println(tesla);
          tesla.spacing();
          tesla.drive();
          tesla.start();
          System.out.println("-----------------------------------------------------------------");

          Toyota toyota = new Toyota("Carolla",2020,23000.0,"White",234);
          System.out.println(toyota);
          toyota.start();
          toyota.drive();
          toyota.reliable();
          System.out.println("--------------------------------------------------------------------");

          BMW bmw = new BMW("7",2009,20000.0,"Green",234);
          System.out.println(bmw);
          bmw.start();
          bmw.racing();
          bmw.breakDown();
          bmw.drive();


     }




}
